

public class SearchInSortedMatrix {
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        // Methods :- Brute force
                //  Binary search in each row - n logn 

        // 13 -> (n-1 , 0)
            // key < cell value -> top
            // key > cell value -> right

        // 4 -> (0 , m-1)
            // key < cell value -> left
            // key > cell value -> bottom

        int key = 14;
        int row = 0;
        int col = arr[0].length-1;
        while (row < arr.length && col >=0) {
            if(arr[row][col] == key) {
                System.out.println("Element found");
                return;
            }
            else if(arr[row][col] > key) {
                col--;
            }
            else 
                row++;
        }
        System.out.println("Element not found");
    }
}
