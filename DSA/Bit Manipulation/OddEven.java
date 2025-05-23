

public class OddEven {
    
    public static void main(String args[]) {
        // If the least significant bit is 0 it is even , else if it is 1 it is a odd number

        int a = 5;
        int b = 6;

        if((a & 1) == 1)
            System.out.println("Odd number");
        if((b & 1) == 0)
            System.out.println("Even number");
    }
}
