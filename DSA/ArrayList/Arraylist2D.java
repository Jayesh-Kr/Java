package DSA.ArrayList;

import java.util.ArrayList;

public class Arraylist2D {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        mainList.add(list);
        mainList.add(list2);

        System.out.println(mainList);
    }
}
