package DSA.Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {7,8,2,14,96,3,2};
        int len = arr.length;

        for(int i=0; i<len-1; i++) {
            int minPos = i;
            for(int j=i+1; j<len; j++) {
                if(arr[j] < arr[minPos])
                    minPos = j;
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }

        for(int x : arr)
            System.out.print(x+" ");
    }
}
