package DSA.Recursion;

public class SumofFistN {

    public static int sumOfFirst(int n) {
        if(n == 0)
            return 0;
        return n + sumOfFirst(n-1);
    }
    public static void main(String[] args) {
        int ans = sumOfFirst(10);
        System.out.println(ans);
    }
}
