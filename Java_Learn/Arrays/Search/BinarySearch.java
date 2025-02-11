package Java_Learn.Arrays.Search;

public class BinarySearch {
    public static void main(String[] args) {
        // Array should be sorted...
        int arr[] = {5,11,23,45,62,112};
        int key = 162;
        int start = 0;
        int end = arr.length-1;
        
        while(start <= end) {
            int mid = (end + start) / 2;
            if(arr[mid] == key) {
                System.out.println("Element found at index : " + mid);
                return;
            } else if(arr[mid] < key) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        System.out.println("Element not found");

    }
}
