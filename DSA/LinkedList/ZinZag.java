package DSA.LinkedList;

public class ZinZag {
    public static class  Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        public static Node head = null;

        public static Node findMid() {
            Node slow = head;
            Node fast = head.next;

            while(fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            return slow;
        }

        public static Node reverseNode(Node head) {
            Node prev = null;
            Node curr = head;
            Node next = null;

            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            return prev;
        }

        public static void zigzag() {
            Node miNode = findMid();
            Node leftPart = head;
            Node rightPart = reverseNode(miNode.next);
            miNode.next = null;
            Node nextLeft = null;
            Node nextRight = null;

            while(leftPart != null && rightPart != null) {
                nextLeft = leftPart.next;
                nextRight = rightPart.next;

                leftPart.next = rightPart;
                rightPart.next = nextLeft;

                leftPart = nextLeft;
                rightPart = nextRight;
            }
        }
        public static void main(String[] args) {
            head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(4);

            zigzag();

            while (head != null) {
                System.out.print(head.data + " ");
                head = head.next;
            }
        }
}
