package DSA.Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {5,1,2,36,7,8};
        int len = arr.length;

        for(int i=0; i<len-1; i++) {
            for(int j=0; j<len-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int x : arr)
            System.out.print(x+" ");
    }
}
