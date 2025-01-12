import java.util.*;
public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println("Enter the decimal number");
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        int binary = 0;
        int p = 0;
        while (decimal > 0) {
            int rem = decimal % 2;
            binary = binary + (rem * (int) Math.pow(10, p));
            p++;
            decimal /= 2;
        }
        System.out.println("The Binary of the Decimal is : " + binary);
        sc.close();
    }
}
