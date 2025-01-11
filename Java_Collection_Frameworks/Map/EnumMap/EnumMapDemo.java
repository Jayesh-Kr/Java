package Java_Collection_Frameworks.Map.EnumMap;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo {
    public static void main(String[] args) {
        Map<Day,Integer> map = new EnumMap<>(Day.class);
        map.put(Day.Thursday, 87);
        map.put(Day.Monday, 234);
        map.put(Day.Saturday, 234434);
        System.out.println(map);

        
        // Array of same size as Enum
        // No hashing
        // Ordinal/index is used
    }
}

enum Day {
    Monday , Tuesday , Wednesday , Thursday , Friday , Saturday , Sunday
}