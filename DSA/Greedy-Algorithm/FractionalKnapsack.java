// package DSA.Greedy-Algorithm;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int weight[] = {10,20,30};
        int value[] = {60,100,120};

        // ratio = {6,5,4};
        // Here the ratio came in descending order, if not then arrange them 
        double ratio[][] = new double[weight.length][2];
        for(int i=0; i<weight.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = value[i] /(double) weight[i];
        }
        
        // Sorting
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = 50; // 50 kg
        double totalPrice = 0;

        for(int i = weight.length-1; i >= 0; i--) {
            
            if(capacity >= weight[(int)ratio[i][0]]) {
                totalPrice = totalPrice + (ratio[i][1] * weight[(int)ratio[i][0]]);
                capacity = capacity - weight[(int)ratio[i][0]];
            } else {
                totalPrice = totalPrice + (ratio[i][1] * capacity);
                capacity = 0;
            }
        }

        System.out.println("The total price earned : " + totalPrice);

    }
}
