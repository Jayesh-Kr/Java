package LinkedList;

import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.get(2); // O(n)
        ll.addLast(4);
        ll.addFirst(0);
        ll.getLast();
        ll.getFirst();
        ll.remove(); // Removes 0th index
        ll.remove(2);
        System.out.println(ll);


        //! If we do Link<Integer> ll = new LinkedList<>(); --> We can't access some methods bcz the reference is of List we can only use the method which are in List interface

        //? We can perform same things as done in ArrayList

    }
}
