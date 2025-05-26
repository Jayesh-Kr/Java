package DSA.LinkedList;

public class Linkedlist {

    // Creation of Node class
    public class  Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head = null;
    public static Node tail = null;
    public static int size = 0;

    // Adding in the first position
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if(head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Adding in the last position
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if(head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }


    // Adding in the middle of the list
    public void addInMiddle(int data, int index) {
        int i = 0;
        Node temp = head;
        while(i < index-1) {
            temp = temp.next;
            i++;
        }
        Node newNode = new Node(data);
        size++;
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Removing element from the first position
    public void removeFirst() {
        if(head == null) {
            System.out.println("LL is empty");
            return;
        } else if(head.next == null) {
            head = tail = null;
            return;
        }
        size--;
        head = head.next;
    }

    // Removing element from the last position
    public void removeLast() {
        if(head == null) {
            System.out.println("LL is empty");
            return;
        } else if(head.next == null) {
            head = tail = null;
            return;
        }
        
        Node temp = head;
        while(temp.next.next != null) {
            temp = temp.next;
        }
        size--;
        temp.next = null;
        tail = temp;
    }

    // Searching the element 
    public void searchKey(int key) {
        if(head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null) {
            if(temp.data == key) {
                System.out.println("Element found in the list");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Element not found in the list");
    }


    // Searching the element using recursiion
    public void searchRecursive(Node temp, int key) {
        if(temp == null) {
            System.out.println("Element not found in the list");
            return;
        }
        if(temp.data == key) {
            System.out.println("Element found in the list");
            return;
        }
        searchRecursive(temp.next, key);
    }

    // Reversing the LinkedList
    public void reverseLinkedlist() {
        Node next = null;
        Node prev = null;
        Node curr = head;
        tail = head;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // Printing the elements
    public void printLinkedlist() {
        if(head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("");
    }
    public static void main(String args[]) {
        Linkedlist ll = new Linkedlist();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.addInMiddle(100, 2);

        ll.printLinkedlist();

        ll.removeFirst();
        ll.removeLast();
        ll.printLinkedlist();

        ll.searchKey(1000);
        Node temp = head;
        ll.searchRecursive(temp, 100);

        ll.reverseLinkedlist();
        ll.printLinkedlist();
    }
}
