import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


class Arraylist {

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        // or 
        // List<Integer> list = new ArrayList<>();
        //! Default capacity of ArrayList is 10
        //? Adding elements to ArrayList
        list.add(1);
        list.add(18);
        list.add(78);
        list.add(63);
        list.add(73);
        list.add(78);

        // How to add any element at any index  -> list.add(index , element)
        list.add(3,1169);

        // How to add any element at any index by replacing that value of that index  -> list.set(index, element)
        list.set(3, 169);

        // removing elements -> list.remove(index)
        list.remove(5);

        // to check whethere an element is present in an Array or not
        list.contains(73);
        System.out.println(list.contains(63));

        // ! -----
        System.out.println(list);
        // Iterating the Arraylist
        for(int i=0; i<list.size(); i++) {  // How to get the size of the list -> list.size()
            System.out.println(list.get(i)); // How to get the value of the list via index  -> list.get(index)
        }

        // second way
        for(int x:list) {
            System.out.println(x);
        }



        //! Some Important things - 
        //? Ways to create a ArrayList
        ArrayList<String> newlist = new ArrayList<>();
        //
        Arrays.asList("Ram","Shyam");   
        // ArrayList<String> newlist = Arrays.asList("ram","Sham") //! this is wrong way as asList is returning an List
        List<String> newlist2 = Arrays.asList("Ram","Shyam");

        // or
        String arr[] = {"apple","mango"};
        List<String> fruit = Arrays.asList(arr);

        // In newer version of java
        List<Integer> list3 = List.of(1,2,3,4);

        //! Above in both the cases we can't modify the the list.
        //? Difference between Arrays.asList() and List.of() -> In Arrays.asList() we can replace and get the values but in case of List.of() we can't replace

        //* If we do this thing then we can modify the list as usual..
        List<String> list4 = new ArrayList<>(fruit);

        //? Some other different ways to add 
        List<Integer> list22 = List.of(5,6,7,8);
        List<Integer> list6 = new ArrayList<>();
        list6.add(1);
        list6.add(2);
        list6.addAll(list22); // ! This adds up the collection
        System.out.print(list6);

        //? Some other cool things for removing 
        List<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        List<String> tt = new ArrayList<>();
        tt.add("Chair");
        tt.add("Tub");
        tt.add("Mouse");
        tt.add("Key");

        //* We can remove things by giving their value as well as giving their index
        tt.remove("Mouse");
        //! To remove the integer we do -
        number.remove(Integer.valueOf(3));


        //! How to convert list into Array
        Object arr1[] = list.toArray();
        Integer arr2[] = list.toArray(new Integer[0]);

        //? How to sort list
        Collections.sort(list);
        // When we see .sort it has list.sort(null) so we can directly use instead of collections.sort(list)
        list.sort(null);
    }
     
}