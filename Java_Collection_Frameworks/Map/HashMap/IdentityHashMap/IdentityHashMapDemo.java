package Java_Collection_Frameworks.Map.IdentityHashMap;

import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        String k1 = new String("Hello");
        String k2 = new String("Hello");
        IdentityHashMap<String,Integer> map = new IdentityHashMap<>();
        map.put(k2, 24);
        map.put(k1, 23);
        System.out.println(map);


        //
        System.out.println(System.identityHashCode(k1));
        System.out.println(System.identityHashCode(k2));
        System.out.println(k1.hashCode());
        System.out.println(k2.hashCode());
    }
}
