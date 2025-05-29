package DSA.Stack;

import java.util.Stack;

public class ValidParenthesis {

    public static boolean isValidParenthesis(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '{' || c == '(' || c == '[')
                s.push(c);
            else if (c == '}' || c == ']' || c == ')') {
                if (s.isEmpty())
                    return false;
                char top = s.peek();
                if ((c == ']' && top == '[') || (c == '}' && top == '{') || (c == ')' && top == '('))
                    s.pop();
                else
                    return false;
            } else
                return false;
        }
        if (!s.isEmpty())
            return false;
        return true;
    }

    public static void main(String[] args) {
        String s = "({[]})";
        if (isValidParenthesis(s))
            System.out.println("Valid Parenthesis");
        else
            System.out.println("Invalid Parenthesis");
    }
}
