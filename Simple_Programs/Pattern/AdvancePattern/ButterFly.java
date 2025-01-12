package Pattern.AdvancePattern;

public class ButterFly {
    public static void main(String[] args) {
        int rows = 10;
        // 1st half
        for(int i=1; i<=rows/2; i++) {
            for(int j=1; j<=rows; j++) {
                if(j > i && j < rows -i)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half
        for(int i=rows/2; i>=1; i--) {
            for(int j=1; j<=rows; j++) {
                if(j > i && j < rows -i)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
