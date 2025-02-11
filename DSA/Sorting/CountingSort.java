package DSA.Sorting;

public class CountingSort {
    public static void main(String[] args) {
        int arr[] = {5,7,4,1,31};
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++)
            largest = Math.max(largest, arr[i]);

        int count[] = new int[largest+1];

        for(int i=0; i<arr.length; i++)
            count[arr[i]]++;

        int j = 0;
        for(int i=0; i<count.length; i++) {
            while(count[i] > 0) {
                arr[j] = i;
                count[i]--;
                j++;
            }
        }
        for(int x:arr)
            System.out.print(x + " ");
    }
}
