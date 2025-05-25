package DSA.Backtracking;

public class GridWays {

    public static int gridWays(int arr[][], int row, int col) {
        if(row >= arr.length || col >= arr[0].length) {
            return 0;
        }
        if(row == arr.length-1 && col == arr[0].length -1 )
            return 1;
        return gridWays(arr, row+1, col) + gridWays(arr, row, col+1);
    }
    public static void main(String[] args) {
        int n = 2;
        int m = 3;
        int arr[][] = new int[n][m];
        int result = gridWays(arr, 0 ,0);
        System.out.println("Number of ways to reach : " + result);
    }
}
