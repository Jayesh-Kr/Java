

public class MergeSort {

    public static void mergeArray(int arr[], int start, int mid, int end) {
        int len = (end-start)+1;
        int temp[] = new int[len];
        int k = 0;
        int i = start;
        int j = mid+1;
        while(i <= mid && j <= end) {
            if(arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while(i <= mid) {
            temp[k++] = arr[i++];
        }
        while(j <= end) {
            temp[k++] = arr[j++];
        }
        for(int x=start; x<=end; x++) {
            arr[x] = temp[x-start];
        }
    }

    public static void mergeSort(int arr[], int start, int end) {
        if(start < end) {
            int mid = (start+end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);
            mergeArray(arr,start,mid,end);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,98,7,4,1,2,6};
        mergeSort(arr,0,arr.length-1);
        for(int x = 0; x < arr.length; x++) {
            System.out.print(arr[x] + " ");
        }
    }
}
