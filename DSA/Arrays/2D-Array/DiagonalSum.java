
public class DiagonalSum {
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        // Not Optimized code
        // int sum = 0;
        // for(int i=0; i<arr.length; i++) {
        //     for(int j=0; j<arr[0].length; j++) {
        //         if(i == j)
        //             sum += arr[i][j];
        //         else if(i+j == arr.length-1)
        //             sum += arr[i][j];
        //     }
        // }
        // System.out.println(sum);

        int sum = 0;
        int l = arr.length;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i][i];
            if(i != arr.length-1-i)
                sum+=arr[l-1-i][i];
        }
        System.out.println(sum);
    }
}
