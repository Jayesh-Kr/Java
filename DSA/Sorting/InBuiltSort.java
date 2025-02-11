package DSA.Sorting;
import java.util.Arrays;
import java.util.Collections;
public class InBuiltSort {
    public static void main(String[] args) {
        int arr[] = {2,56,9,7,1,23};
        Arrays.sort(arr);
        // Arrays.sort(arr , si, ei)
        // O( n log(n) )

        for(int x:arr)
            System.out.print(x + " ");

        System.out.println("");
        // For reverse
        // It will not work for int. Works for Interger - bcz : reverseOrder works for objects
        Integer arr2[] = {8,6,9,7,8,54};
        Arrays.sort(arr2,Collections.reverseOrder());
        for(int x:arr2)
            System.out.print(x + " ");
    }
}
