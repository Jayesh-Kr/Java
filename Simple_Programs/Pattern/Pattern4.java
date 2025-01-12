package Pattern;

public class Pattern4 {
    public static void main(String[] args) {
        char c = 'A';
        int n = 4;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }
}
