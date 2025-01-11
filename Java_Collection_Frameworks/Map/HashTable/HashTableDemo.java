package Java_Collection_Frameworks.Map.HashTable;

import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer,String> map = new Hashtable<>();
        // HashTable is synchornized
        // No null key or value
        // Legacy class -> , ConcurrentHashMap
        // Slower than hashmap
        // Only LinkedList is case of collision
        
        map.put(1, "one");
        map.put(2, "two");
        map.put(69, "Sixty-Nine");
        map.put(3, "three");
        System.out.println(map);
    }
}