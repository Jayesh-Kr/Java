
public class BitOperators {
    
    public static void main(String args[]) {

        int a = 5; // 101
        int b = 6; // 110

        // And (&)
        System.out.println(a&b);
        
        // Or (|)
        System.out.println(a|b);

        // Not (~)
        System.out.println(~a);

        // XOR (^)  - If bits are different ans will be 1 , else 0
        System.out.println(a^b);

        // Left shift (<<) -    a = a * 2^i
        System.out.println(1<<2);

        // Right shift (>>)  -  a = a / 2^i
        System.out.println(5>>1);
    }
}
