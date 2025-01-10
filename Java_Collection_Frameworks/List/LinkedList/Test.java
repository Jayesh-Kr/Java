package LinkedList;
public class Test {
    public static void main(String args[]) {
        Node ll1 = new Node();
        ll1.data = 5;
        ll1.next = null;
        
        // or 
        Node ll2 = new Node();
        ll1.next = ll2;
        ll2.data = 6;
        ll2.next = null;
    }
}

class Node {
    public int data;
    public Node next;
}
