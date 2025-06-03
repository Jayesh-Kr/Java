package DSA.Trees.BinarySearchTree;

public class PrintInRange {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.left = null;
            this.right = null;
            this.data = data;
        }
    }

    public static Node createBST(Node root, int n) {
        if (root == null)
            return new Node(n);
        if (root.data < n) {
            root.right = createBST(root.right, n);
        } else {
            root.left = createBST(root.left, n);
        }

        return root;
    }

    public static void printInRange(Node root, int k1, int k2) {
        if(root == null)
            return;
        if(root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        } else if(root.data < k1) {
            printInRange(root.right, k1, k2);
        } else {
            printInRange(root.left, k1, k2);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 1, 3, 4, 2, 7 };

        Node root = null;
        for (int i = 0; i < arr.length; i++) {
            root = createBST(root, arr[i]);
        }

        printInRange(root);
    }
}
