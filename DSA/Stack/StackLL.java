package DSA.Stack;

public class StackLL {
    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        static Node head = null;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {
            Node newNode = new Node(data);
            if(head == null) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static int pop() {
            if(head == null) {
                System.out.println("Stack underflow");
                return Integer.MIN_VALUE;
            }
            int value = head.data;
            head = head.next;
            return value;
        }

        public static int peek() {
            if(head == null) {
                System.out.println("Stack underflow");
                return Integer.MIN_VALUE;
            }
            int value = head.data;
            return value;
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
