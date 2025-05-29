package DSA.Stack;

import java.util.Stack;

public class DuplicateParenthesis {

    public static boolean isDuplicateParenthesis(String str) {
        Stack<Character> s = new Stack<>();

        for(int i = 0; i < str.length() ; i++) {
            char c = str.charAt(i);

            if(c == ')') {
                int count = 0;
                while(s.peek() != '(') {
                    count++;
                    s.pop();
                }
                if(count < 1)
                    return false;
                else
                    s.pop();
            } else {
                s.push(c);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "((a+b) + (c+d))";
        System.out.println((isDuplicateParenthesis(s)));
    }
}
