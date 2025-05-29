import java.util.Stack;

public class NextGreaterElement {

    public static int[] findNextGreater(int arr[]) {
        int nextGreater[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();

        for(int i=arr.length-1; i>=0; i--) {
            
            while(!s.isEmpty() && arr[i] >= s.peek()) 
                s.pop();
            if(s.isEmpty())
                nextGreater[i] = -1;
            else    
                nextGreater[i] = s.peek();
            
            s.push(arr[i]);
        }

        return nextGreater;
    }
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        int nextGreater[] = findNextGreater(arr);
        for(int i=0; i<nextGreater.length; i++)
            System.out.print(nextGreater[i] + " ");
    }
}
