// package DSA.Greedy

import java.util.Arrays;

public class MinimumSum {
    public static void main(String[] args) {
        int A[] = {1,5,4,78,3,2};
        int B[] = {6,9,8,1,23,1};

        // sort
        Arrays.sort(A);
        Arrays.sort(B);

        int minSum = 0;
        for(int i = 0; i<A.length ;i ++) {
            minSum = minSum + Math.abs(A[i] - B[i]);
        }

        System.out.println("Minimum sum is : " + minSum);
    }
}
