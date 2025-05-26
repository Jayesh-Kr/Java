package DSA.ArrayList;

import java.util.ArrayList;

public class PairSum {

    public static boolean findPairSum(ArrayList<Integer> list, int target) {

        // Brute force
        // int sum = 0;
        // for(int i = 0; i<list.size()-1; i++) {
        //     for(int j = i+1; j < list.size(); j++) {
        //         int elem1 = list.get(i);
        //         int elem2 = list.get(j);
        //         sum = elem1 + elem2;
        //         if(target == sum)
        //             return true;
        //     }
        // }

        // Two pointer approach
        int sum = 0;
        int lp = 0;
        int rp = list.size()-1;
        while(lp < rp) {
            int elem1 = list.get(lp);
            int elem2 = list.get(rp);
            sum = elem1 + elem2;
            if(sum == target)
                return true;
            
            if(sum < target)
                lp++;
            else
                rp--;
        }
        return false;
    }
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        int target = 75;
        System.out.println(findPairSum(list, target));
    }
}
