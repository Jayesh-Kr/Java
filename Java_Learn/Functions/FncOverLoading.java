package Java_Learn.Functions;

public class FncOverLoading {
    // Overlaoding using parameters
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }
    // Overloading using data types
    public static int sum(int a , int b) {
        return a + b;
    }
    public static float sum(float a , int b) {
        return a + b;
    }
    public static void main(String[] args) {

        // Function overloading can be achieved either by parameters or data types used in parameters
        // e.g.
        //! Function overloading is not achieved by using different return types 

        System.out.println(multiply(5,10));
        System.out.println(multiply(5,10,2));
        System.out.println(sum(5,10));
        System.out.println(sum(5.0f,10));
    }
}
