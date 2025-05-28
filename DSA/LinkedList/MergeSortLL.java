package DSA.LinkedList;

import java.util.LinkedList;

public class MergeSortLL {

    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head = null;
    
    public static Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1 != null && head2 != null) {
            if(head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    public static Node mergeSort(Node head) {
        if(head == null || head.next == null)
            return head;
        
        // find mid
        Node midNode = findMid(head);

        Node rightHead = midNode.next;
        midNode.next = null;
        // left part
        Node leftPart = mergeSort(head);
        // Right part
        Node rightPart = mergeSort(rightHead);

        // merge
        return merge(leftPart, rightPart);

    }

    public static Node findMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        head = mergeSort(head);

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
