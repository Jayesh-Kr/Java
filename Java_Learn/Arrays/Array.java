package Java_Learn.Arrays;

public class Array {
    public static void main(String[] args) {
        // Syntax
        // data_type name[] = new data_type[size];
        int arr[] = new int[10];
        int arr2[] = {1,23,4,5};

        // input in array
        arr[0] = 1;
        arr[2] = 15;
        arr[3] = 78;

        // Reading the value of array
        System.out.println(arr[0]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        // How to get the lenght of array
        System.out.println(arr.length);
    }
}
