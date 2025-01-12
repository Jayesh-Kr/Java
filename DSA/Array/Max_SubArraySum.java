package DSA.Array;

public class Max_SubArraySum {

    public static int maxSumBruteForce(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                int sum = 0;
                for(int k=i; k<=j; k++) {
                    sum += arr[k];
                }
                if(sum > maxSum)
                    maxSum = sum;
            }
        }
        return maxSum;
    }


    public static int maxSumBrutePrefix(int arr[]) {
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1; i<arr.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                int sum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
                if(sum > maxSum)
                    maxSum = sum;
            }
        }
        return maxSum;
    }


    public static int maxSumBruteKadane(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0; i<arr.length; i++) {
            currSum = currSum + arr[i];
            if(currSum < 0) 
                currSum = 0;
            if(currSum > maxSum)
                maxSum = currSum;
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] ={-1,2,-9,14,2,-7};
        // Brute Force Approach
        // int res = maxSumBruteForce(arr);
        // System.out.println("Maximun Sum of SubArray is : " + res);

        // Prefix sum
        // int res = maxSumBrutePrefix(arr);
        // System.out.println("Maximun Sum of SubArray is : " + res);


        int res = maxSumBruteKadane(arr);
        System.out.println("Maximun Sum of SubArray is : " + res);
    }
}
