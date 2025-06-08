public class ValidBST {

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

    public static boolean isValidBST(Node root, Node min, Node max) {
        if(root == null)
            return true;

        if(min != null && root.data <= min.data) 
            return false;

        else if(max != null && root.data >= max.data) {
            return false;
        }

        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }

    public static void main(String[] args) {
        int arr[] = { 5, 1, 3, 4, 2, 7 };

        Node root = null;
        for (int i = 0; i < arr.length; i++) {
            root = createBST(root, arr[i]);
        }

        if(isValidBST(root, null, null))
            System.out.println("Valid BST");
        else    
            System.out.println("Not Valid BST");
    }
}
