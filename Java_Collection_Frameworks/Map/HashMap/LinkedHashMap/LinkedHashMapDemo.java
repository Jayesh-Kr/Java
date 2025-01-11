package Java_Collection_Frameworks.Map.LinkedHashMap;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        // LinkedHashMap<String,Integer> map = new LinkedHashMap<>(11,.8f,true); //? In this the 3rd parameter is accessOrder, which means when we pass true in accessOrder the element which is accessed recently will go at bottom..
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        map.put("apple", 1);
        map.put("mango", 84);
        map.put("kiwi", 23);
        map.put("lichi", 234);

        // e.g. for seeing if accessOrder is true.
        map.get("mango"); //? Initially when we print it would print in the same order as we have putted in map. Now after giving true in accessOrder "mango" will come at last of the map....

        for(String i : map.keySet()) {
            System.out.println(i + " : " + map.get(i));
        }
    }
}
