package DSA.Trees.BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class KthLevel {

    static class  Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }        
    }

    public static void kthIteration(Node root, int level) {

        Queue<Node> q = new LinkedList<>();
        int i = 1;
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if(currNode == null) {
                i++;
                if(q.isEmpty())
                    break;
                else    
                    q.add(null);
            } else {
                if(i == level)
                    System.out.print(currNode.data + " ");
                if(currNode.left != null)
                    q.add(currNode.left);
                if(currNode.right != null)
                    q.add(currNode.right);
            }
        }
    }

    public static void kthRecursive(Node root, int level, int i) {
        if(root == null)
            return;
        if(i == level) {
            System.out.print(root.data + " ");
            return;
        }

        kthRecursive(root.left, level, i+1);
        kthRecursive(root.right, level, i+1);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // kthIteration(root,3);

        kthRecursive(root,3,1);
    }
}
