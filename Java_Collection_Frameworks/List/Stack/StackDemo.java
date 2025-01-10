package Stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        stack.pop();
        stack.pop();
        System.out.println(stack);

        int num = stack.peek();
        System.out.println(num);
        System.out.println(stack.isEmpty());
        System.out.println(stack.search(2)); // it is 1 based index

        // Since stack extends vector we can use the methods of vector also in stack

        //? How to use LinkedList as Stack
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.getLast(); // peek();
        ll.removeLast(); // pop();

        //? ArrayList as Stack
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.get(arr.size()-1); // peek()
        arr.remove(arr.size()-1); // pop
    }
}
