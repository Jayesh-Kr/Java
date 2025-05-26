package DSA.ArrayList;
import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
        // Creation
        // classname objectName = new Classname();
        ArrayList<Integer> list = new ArrayList<>();

        // Adding elements in list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1,50);

        System.out.println(list);

        // Get elements value
        System.out.println(list.get(0));

        // Remove element
        list.remove(2);

        // Setting value in list
        list.set(0, 5);

        System.out.println(list.contains(10));
        System.out.println(list.contains(5));

        // Length of list
        System.out.println(list.size());
    }
}