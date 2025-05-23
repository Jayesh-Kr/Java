package Java_Learn.Strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        for(int i = 0; i < str.length()/2 ; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)) {
                System.out.println("String is not palindrome");
                return;
            }                
        }
        System.out.print("String is palindrome");
    }
}
