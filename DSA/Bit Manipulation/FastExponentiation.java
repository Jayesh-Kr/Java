public class FastExponentiation {
    public static void main(String args[]) {
        // 3 ^ 5   = 3 ^ (101)
        // 101  = 1*a^4 * 1 * 1*a^1   = a^5
        
        int ans = 1;
        int exp = 10;
        int a = 3;

        while(exp > 0) {
            if((exp & 1) == 1) {
                ans = ans * a;
            }
            a = a * a;
            exp = exp >> 1;
        }

        System.out.println(ans);
    }
}