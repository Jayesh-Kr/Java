package DSA.Stack;

import java.util.ArrayList;

public class StackArrayList {
    public static class Stack {
        ArrayList<Integer> list = new ArrayList<>();

        public boolean isEmpty() {
            return list.size() == 0;
        }

        public void push(int data) {
            list.add(data);
        }

        public int pop() {
            if (list.size() == 0) {
                System.out.println("Stack underflow");
                return Integer.MIN_VALUE;
            }

            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        public int peep() {
            if (list.size() == 0) {
                System.out.println("Stack underflow");
                return Integer.MIN_VALUE;
            }
            
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {

        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
