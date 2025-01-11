package Java_Collection_Frameworks.Map.ConcurrentMap.ConcurrentSkipListMap;

import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapDemo {
    public static void main(String[] args) {
        ConcurrentSkipListMap<Integer,Integer> map = new ConcurrentSkipListMap<>();
        map.put(8, 6);
    }
}
