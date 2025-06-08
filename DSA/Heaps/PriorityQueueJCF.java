package DSA.Heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueJCF {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(1);
        pq.add(10);
        pq.add(7); // O(log n)
        pq.add(2);

        while(!pq.isEmpty()) {
            System.out.print(pq.peek() + " "); // O(1)
            pq.remove();    // O(log n)
        }
    }
}
