package Java_Learn.Strings;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        // char c[] = {'j','a','y'};
        // String s = "Jayesh";
        // String s2 = new String("Jayesh");

        // Taking input
        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.next();   // Take just one word
        // System.out.println(name);
        // String sen;
        // sen = sc.nextLine();
        // System.out.println(sen);
        // sc.close();


        // getting each letter of string
        String str = "hello World";
        for(int i=0;i<str.length();i++)
            System.out.print(str.charAt(i) + " ");
    }
}
