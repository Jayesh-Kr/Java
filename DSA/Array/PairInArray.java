package DSA.Array;

public class PairInArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                System.out.print("("+arr[i]+","+arr[j]+") ");
            }
            System.out.println();
        }
        // Formula for total number of pairs = n(n-1) / 2
    }
}
