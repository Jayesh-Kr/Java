package DSA.Recursion;

public class PowerOfX {

    public static int powerOfX(int n, int exp) {
        if(exp == 0)
            return 1;
        return n * powerOfX(n, exp-1);
    }

    public static int optimisedMethod(int n, int exp) {
        if(exp == 0)
            return 1;
        int halfPower = optimisedMethod(n, exp/2);
        int fullPower = halfPower * halfPower;

        if(exp % 2 == 1)
            return  n * fullPower;
        
        return fullPower;
    }
    public static void main(String[] args) {
        System.out.println(powerOfX(2, 5));
        System.out.println(optimisedMethod(2, 5));
    }
}
