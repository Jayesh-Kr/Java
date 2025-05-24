package DSA.Recursion;

public class Printing {
    public static void printNum(int n) {
        if(n == 0)
            return;
        System.out.println(n);
        printNum(n-1);
    }

    public static void printInc(int n) {
        if(n == 0)
            return;
        printInc(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        printNum(10);
        printInc(10);
    }
}
