package DSA.Stack;

import java.util.Stack;

public class ReverseStack {

    public static void pushAtBottom(Stack<Integer> s, int value) {
        if(s.isEmpty()) {
            s.push(value);
            return;
        }
        int data = s.pop();
        pushAtBottom(s, value);
        s.push(data);
    }

    public static void reverseStack(Stack<Integer> s) {
        if(s.isEmpty())
            return;
        int value = s.pop();
        reverseStack(s);
        pushAtBottom(s, value);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s);
        reverseStack(s);
        System.out.println(s);
    }
}
