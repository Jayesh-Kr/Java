package DSA.Stack;

import java.util.Stack;

public class MaxAreaHistogram {

    public static int[] findMinRight(int arr[]) {
        Stack<Integer> s = new Stack<>();
        int nextSmaller[] = new int[arr.length];
        for(int i = arr.length-1; i >=0; i--) {

            while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            } if(s.isEmpty()) {
                nextSmaller[i] = arr.length;
            } else 
                nextSmaller[i] = s.peek();

            s.push(i);
        }
        return nextSmaller;
    }
    public static int[] findMinLeft(int arr[]) {
        Stack<Integer> s = new Stack<>();
        int nextSmaller[] = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {

            while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            } if(s.isEmpty()) {
                nextSmaller[i] = -1;
            } else 
                nextSmaller[i] = s.peek();

            s.push(i);
        }
        return nextSmaller;
    }

    public static int findMaxAreaFromHistogram(int arr[]) {

        // next smaller right
        int nsr[] = findMinRight(arr);

        // next smaller left
        int nsl[] = findMinLeft(arr);

        int maxArea = 0;

        for(int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] -1;
            int currArea = height * width;
            maxArea = Math.max(maxArea, currArea);
        }

        return maxArea;
    }
    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3};
        int area = findMaxAreaFromHistogram(arr);
        System.out.println(area);
    }
}
