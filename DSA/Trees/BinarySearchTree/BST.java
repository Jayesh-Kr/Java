package DSA.Trees.BinarySearchTree;

public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
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

    public static void inOrder(Node root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void searchBST(Node root, int n) {
        if (root == null) {
            System.out.println("Value not found in BST");
            return;
        }

        if (root.data == n) {
            System.out.println("Value found in BST");
            return;
        } else if (root.data < n)
            searchBST(root.right, n);
        else
            searchBST(root.left, n);
    }

    public static Node findInorderSuccessor(Node root) {
        while(root.left != null)
            root = root.left;
        return root;
    }

    public static Node deleteNode(Node root, int n) {

        if(root.data < n)
            root.right = deleteNode(root.right, n);
        else if(root.data > n)
            root.left = deleteNode(root.left, n);
        
        else {

            // Leaf node
            if(root.left == null && root.right == null)
                return null;
            
            // One child
            else if(root.left == null)
                return root.right;
            else if(root.right == null)
                return root.left;

            // Both children
            Node succ = findInorderSuccessor(root.right);
            root.data = succ.data;
            root.right = deleteNode(root.right, succ.data);
        }
    }
    public static void main(String[] args) {

        int arr[] = { 5, 1, 3, 4, 2, 7 };

        Node root = null;
        for (int i = 0; i < arr.length; i++) {
            root = createBST(root, arr[i]);
        }
        // inOrder(root);
        searchBST(root, 14);
    }
}
