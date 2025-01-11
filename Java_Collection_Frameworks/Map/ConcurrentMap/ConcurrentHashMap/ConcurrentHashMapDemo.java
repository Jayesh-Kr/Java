package Java_Collection_Frameworks.Map.ConcurrentMap.ConcurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer,Integer> map = new ConcurrentHashMap<>();
        // Java 7 --> Segment based locking --> 16 segments --> Smaller hashmaps
        // Only the segments being written to or read from is locked
        // Read : Do not require locking unless a writing operation is happening on the same segment
        // Write : Locking

        // Java 8 --> No segmentation
        //        --> Compare and Swap Approach --> NO locking except resizing or collision
        // Thread A last saw --> x = 45
        // Thread A work --> x to 50
        // if x is still 45, then change it to 50 else don't change and retry
        // put --> index

        // MAP --> SORTED --> THREAD SAFE --> ConcurrentSkipListMap
    }
}
