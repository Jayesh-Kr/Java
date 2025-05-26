package DSA.ArrayList;

import java.util.ArrayList;

// Rotated array

public class PairSum2 {

    public static int findPivot(ArrayList<Integer> list) {

        for(int i=0; i<list.size()-1; i++) {
            if(list.get(i) > list.get(i+1))
                return i+1;
        }
        return 0;
    }

    public static boolean findPairSum(ArrayList<Integer> list,  int target, int pivot) {

        int rp = pivot-1;
        int lp = pivot;
        int n = list.size();
        while(lp != rp) {
            int elem1 = list.get(lp);
            int elem2 = list.get(rp);
            int sum = elem1 + elem2;
            if(sum ==  target)
                return true;
            if(sum < target)
                lp = (lp+1) % n;
            else
                rp = (n+rp-1) % n;
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(13);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int pivot = findPivot(list);
        System.out.println(findPairSum(list, 9, pivot));
    }
}
