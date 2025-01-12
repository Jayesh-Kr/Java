package Pattern.AdvancePattern;

public class FloydTriangle {
    public static void main(String[] args) {
        int p = 1;
        int rows = 5;
        for(int i=1; i<=rows; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(p + " ");
                p++;
            }
            System.out.println();
        }
    }
}
