
public class MirrorBST {

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

    public static Node mirrorBST(Node root) {
        if(root == null)
            return null;
        Node leftTree = mirrorBST(root.left);
        Node rightTree = mirrorBST(root.right);

        root.left = rightTree;
        root.right = leftTree;

        return root;

    }
    public static void main(String[] args) {
        int arr[] = { 5, 1, 3, 4, 2, 7 };

        Node root = null;
        for (int i = 0; i < arr.length; i++) {
            root = createBST(root, arr[i]);
        }

        Node mirrorTree = mirrorBST(root);
    }
}
