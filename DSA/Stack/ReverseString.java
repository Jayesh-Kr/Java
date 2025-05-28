package DSA.Stack;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        String str = "abcd";
        for(int i=0; i<str.length(); i++) {
            s.push(str.charAt(i));
        }
        String newStr = "";
        while(!s.isEmpty()) {
            newStr += s.pop();
        }

        System.out.println(newStr);
    }
}
