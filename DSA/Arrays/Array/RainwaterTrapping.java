package DSA.Array;
import java.lang.Math;
public class RainwaterTrapping {
    public static void main(String[] args) {
        int arr[] = {4,2,0,6,3,2,5};
        int leftMax[] = new int[arr.length];
        int rightMax[] = new int[arr.length];

        leftMax[0] = arr[0];
        rightMax[arr.length-1] = arr[arr.length-1];

        for(int i=1; i<arr.length; i++)
            leftMax[i] = Math.max(leftMax[i-1], arr[i]);
        for(int i=arr.length-2; i>=0; i--) 
            rightMax[i] = Math.max(rightMax[i+1], arr[i]);

        int maxWater = 0;
        for(int i=0; i<arr.length; i++) {
            int waterLogged = Math.min(rightMax[i], leftMax[i]);
            maxWater = maxWater + waterLogged - arr[i];
        }
        System.out.println("Max water logged is : " + maxWater);
    }
}
