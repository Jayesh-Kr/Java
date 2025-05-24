
public class QuickSort {

    public static int pivotIndex(int arr[], int si, int ei) {
        int pivotElem = arr[ei];
        int i = si-1;
        int j = si;
        while(j < ei) {
            if(arr[j] <= pivotElem) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;
        }
        int temp = arr[ei];
        arr[ei] = arr[++i];
        arr[i] = temp;
        return i;
    }
    public static void quickSort(int arr[], int start, int end) {
        if(start < end) {
            int pivot = pivotIndex(arr, start, end);
            quickSort(arr, start, pivot-1);
            quickSort(arr, pivot+1, end);
        }
    }
    public static void main(String[] args) {
        int arr[] = {9,8,72,10,6,32,2,1};
        quickSort(arr,0,arr.length-1);
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
