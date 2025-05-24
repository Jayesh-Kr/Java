package DSA.Recursion;

public class NthFibonacci {

    public static int nthFibonacci(int n) {
        if(n == 0 || n == 1)
            return n;
        int first = nthFibonacci(n-1);
        int second = nthFibonacci(n-2);
        return (first+second);
    }
    public static void main(String[] args) {
        int ans = nthFibonacci(250);
        System.out.println(ans);
    }
}
