package DSA.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class InterleaveTwoHalves {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        int size = q.size();
        int firstHalfSize = size / 2;

        Queue<Integer> q2 = new LinkedList<>();
        int i = 1;
        while(i<=firstHalfSize) {
            q2.add(q.remove());
            i++;
        }


        // Interleafing
        i = 1;
        while(i<=firstHalfSize) {
            q.add(q2.remove());
            q.add(q.remove());
            i++;
        }

        System.out.println(q);
    }
}
