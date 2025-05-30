package DSA.Queue.Deque;

import java.util.*;
// import java.util.LinkedList;

public class DequeB {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();

        // addFirst
        dq.addFirst(1);

        // addLast
        dq.addLast(2);

        // removeFirst
        dq.removeFirst();

        // removeLast
        dq.removeLast();

        // getFirst
        // dq.getFirst();

        // getLast
        // dq.getLast();

        dq.addLast(500);
        System.out.println(dq);
    }
}
