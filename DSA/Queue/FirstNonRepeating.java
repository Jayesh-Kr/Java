package DSA.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeating {

    public static void findNonRepeating(String str) {
        Queue<Character> q = new LinkedList<>();
        char freq[] = new char[26];
        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            q.add(c);
            freq[c-'a']++;
            while(!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }
            if(q.isEmpty())
                System.out.print(-1 + " ");
            else
                System.out.print(q.peek() + " ");
        }
    }
    public static void main(String[] args) {
        // Stream in question -> mostly solved by queue

        String s = "aabccxb";
        findNonRepeating(s);
    }
}
