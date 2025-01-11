package Java_Collection_Frameworks.Map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(12,"Jk");
        map.put(2, "Apple");
        map.put(83, "goa");
        System.out.println(map);
        System.out.println(map.get(12));
        System.out.println(map.get(876));

        //To check whether a key exist 
        System.out.println(map.containsKey(12));

        // To remove 
        map.remove(2);

        // To get the size
        System.out.println(map.size());

        //To iterate we have to convert it into Set
        for(int i : map.keySet()) {
            System.out.println(i);   //? This will print the key
            System.out.println(map.get(i));  //? This will print the value
        }

        //or
        Set<Map.Entry<Integer,String>> entries = map.entrySet();

        for(Map.Entry<Integer,String> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue() );
            entry.setValue(entry.getValue().toUpperCase());
        }
        System.out.println(map);
        
    }
}
