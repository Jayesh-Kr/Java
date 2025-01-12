import java.util.*;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int p = 0;
        System.out.println("Enter the Binary number");
        Scanner sc = new Scanner(System.in);
        int binary = sc.nextInt();
        int decimal = 0;
        while(binary > 0) {
            decimal = decimal + ((binary % 10) *  (int) (Math.pow(2, p)));
            binary /= 10;
            p++;
        }
        System.out.println("Decimal of the binary is : " + decimal);
        sc.close();
    }
}
