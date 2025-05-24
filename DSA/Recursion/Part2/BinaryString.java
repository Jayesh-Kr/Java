package DSA.Recursion.Part2;

public class BinaryString {
    public static void binaryString(int n, String s, char lastDigit) {
        if(s.length() == n) {
            System.out.println(s);
            return;
        }
        if(lastDigit != '1')
            binaryString(n, s+"1", '1');
        binaryString(n, s+"0", '0');
    }
    public static void main(String[] args) {
        binaryString(3,"",' ');
    }
}
