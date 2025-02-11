import java.util.Scanner;



public class Array2D {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<arr.length; i++) {
            for(int j=0; i<arr[0].length; j++) {
                System.out.print("Enter the element for "+i+","+j);
                arr[i][j] = sc.nextInt();
            }
        }
            sc.close();

            // Printing
            for(int i=0; i<arr.length; i++) {
                for(int j=0; j<arr[0].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println("");
            }
    }
}
