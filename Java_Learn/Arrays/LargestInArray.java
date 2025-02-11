package Java_Learn.Arrays;

public class LargestInArray {
    public static void main(String[] args) {
        int arr[] = {1,58,63,2,5,4};
        int largest = Integer.MIN_VALUE;
        //? We can also assume the first element of the array to be largest
        for(int i=0; i<arr.length; i++)
            if(arr[i] > largest)
                largest = arr[i];
        System.out.println("Largest number in array is : " + largest);
    }
}
