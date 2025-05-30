
// Canonical Coins

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class IndianCoins {
    public static void main(String[] args) {
        Integer[] coins = {1,2,5,10,20,50,100,500,2000};

        Arrays.sort(coins, Comparator.reverseOrder());

        int amount = 5211;
        int totalCoins = 0;

        int i = 0;
        // To store which coins are used
        ArrayList<Integer> list = new ArrayList<>();

        while(amount != 0) {
            if(amount < coins[i])
                i++;
            else {
                amount = amount - coins[i];
                totalCoins++;
                list.add(coins[i]);
            }
        }

        System.out.println("The total number of coins used is : " + totalCoins);
        System.out.println("Coins used are : " + list);
    }
}
