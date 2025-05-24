package DSA.Recursion;

public class OccurenceInArray {

    public static int firstOccurrence(int arr[], int key, int index) {
        if(index == arr.length-1)
            return -1;
        if(arr[index] == key)
            return index;
        return firstOccurrence(arr, key, index+1);
    }

    public static int lastOccurrence(int arr[], int key, int index) {
        if(index == arr.length)
            return -1;
        
        int isFound = lastOccurrence(arr, key, index+1);
        if(isFound == -1 && arr[index] == key) {
            return index;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,1,2,5,4};
        int ans = firstOccurrence(arr, 5, 0);
        System.out.println(ans);

        int ans2 = lastOccurrence(arr, 5, 0);
        System.out.println(ans2);
    }
}
