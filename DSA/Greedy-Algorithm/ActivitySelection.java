// package DSA.Greedy-Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


public class ActivitySelection {
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};
        // IN this approach the end time is given as sorted. What if it is not given in sorted ?

        // Do do that -
        int activities[][] = new int[start.length][3];
        for(int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // Now how to sort the 2D array according to the end time ?

        // Lambda function -> shortform 
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));


        int maxAct = 0;
        ArrayList<Integer> list = new ArrayList<>();

        maxAct = 1;
        list.add(activities[0][0]);
        int lastEnd = activities[0][2];

        for(int i = 1; i < end.length; i++) {
            if(activities[i][1] >= lastEnd) {
                maxAct++;
                list.add(activities[0][0]);
                lastEnd = activities[i][2];
            }
        }

        System.out.println("Max activity = " + maxAct);
    }
}
