package Java_Learn.Arrays.Search;

public class LinearSearch {
    public static int searchKey(int arr[], int key) {
        for(int i=0; i<arr.length; i++)
            if(arr[i] == key)   
                return i;
            
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60};
        int key = 10;
        int res = searchKey(arr, key);
        if(res == -1)
            System.out.println("Not Found");
        else
            System.out.println(res);
    }
}
