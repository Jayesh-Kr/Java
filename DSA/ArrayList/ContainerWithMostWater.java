package DSA.ArrayList;

import java.util.ArrayList;

public class ContainerWithMostWater {

    public static int mostWater(ArrayList<Integer> list) {

        // Brute Force
        // int max = 0;
        // for(int i = 0; i<list.size()-1; i++) {
        //     for(int j = i+1; j < list.size(); j++) {
        //         int minHeight = Math.min(list.get(i), list.get(j));
        //         int width = j - i;
        //         max = Math.max(max, (width * minHeight));
        //     }
        // }
        // return max;

        
        // Two pointer approach
        int maxValue = 0;
        int rp = list.size()-1;
        int lp = 0;
        while(lp < rp) {
            int minHeight = Math.min(list.get(lp), list.get(rp));
            int width = rp - lp;
            maxValue = Math.max(maxValue, (width * minHeight));
            if(list.get(lp) < list.get(rp))
                lp++;
            else    
                rp--;
        }
        return maxValue;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(7);
        list.add(3);
        list.add(9);
        list.add(2);

        System.out.println(mostWater(list));
    }
}
