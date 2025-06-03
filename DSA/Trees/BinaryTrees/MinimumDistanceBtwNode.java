package DSA.Trees.BinaryTrees;

public class MinimumDistanceBtwNode {

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

    public static Node lca(Node root, int n1, int n2) {
        if(root == null || root.data == n1 || root.data == n2)
            return root;

        Node leftPart = lca(root.left,n1,n2);
        Node rightPart = lca(root.right,n1,n2);

        if(rightPart == null)
            return leftPart;
        if(leftPart == null)
            return rightPart;

        return root;        
    }

    public static int lcaDistance(Node root, int n) {
        if(root == null)
            return -1;
        
        if(root.data == n)
            return 0;

        int leftValue = lcaDistance(root.left, n);
        int rightValue = lcaDistance(root.right, n);

        if(leftValue == -1 && rightValue == -1)
            return -1;
        else if(rightValue == -1)
            return leftValue+1;
        else
            return rightValue+1;
    }

    public static int minDistance(Node root, int n1, int n2) {

        Node a = lca(root, n1, n2);
        int leftDis = lcaDistance(a, n1);
        int rightDis = lcaDistance(a, n2);
        return leftDis + rightDis;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.print("Min distance is : " + minDistance(root, 4, 5));
    }
}
