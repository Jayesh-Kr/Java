package DSA.Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {5,1,4,3,2};
        int l = arr.length;
        for(int i=1; i<l; i++) {
            int curr = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev+1] = curr;
        }
            for(int i=0; i<l; i++)
                System.out.print(arr[i]+" ");
    }
}
