package Java_Collection_Frameworks.Map.SortedMap.TreeMap;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

class TreeMapDemo {

    public static void main(String[] args) {
        SortedMap<String,Integer> map = new TreeMap<>();
        // Sorted based on key - either by comparable or comparator

        map.put("Dog", 234);
        map.put("Ball", 7);
        map.put("Zebra", 93);
        map.put("Monkey", 83);
        System.out.println(map);
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.headMap("Zebra"));      // {Ball=7, Dog=234, Monkey=83}
        System.out.println(map.tailMap("Dog"));     // {Dog=234, Monkey=83, Zebra=93}


        //! Important :- TreeMap implements NavigableMap , so using NavigableMap we can use some other methods
        NavigableMap<Integer,String> map2 = new TreeMap<>();
        map2.put(1, "One");
        map2.put(8, "Eight");
        map2.put(4, "Four");
        System.out.println(map2.lowerKey(8));
        System.out.println(map2.ceilingKey(1));
    }
}