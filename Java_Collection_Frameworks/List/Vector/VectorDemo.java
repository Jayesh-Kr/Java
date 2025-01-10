package Vector;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        // Vector<Integer> vector = new Vector<>(initialCapacity , capacityIncrement);
        Vector<Integer> vector = new Vector<>(3);
        System.out.println(vector.capacity());  // Initial capacity is 10
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4); // Now the capacity will be increased by 2 times. If we want to control the capacity Increment use the contructor.

        // Another way or the third constructor is give any collection
        // eg.
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        Vector<Integer> vector2 = new Vector<>(ll);
        //  or
        // Vector<Integer> vector2 = new Vector<>(Arrays.asList(1,2,3));



        // Methods in Vector
        vector.add(2);
        vector.add(2,6);
        vector.get(2);
        vector.set(1,5);
        vector.remove(0);
        vector.size();
        vector.isEmpty();
        vector.contains(vector2);
        vector.clear();

        //? All the methods are same as ArrayList
    }
}
