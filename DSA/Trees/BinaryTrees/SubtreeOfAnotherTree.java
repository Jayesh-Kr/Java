package DSA.Trees.BinaryTrees;

public class SubtreeOfAnotherTree {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


    public static boolean isIdentical(Node root, Node subRoot) {
        if(root == null && subRoot == null)
            return true;
        else if(root == null || subRoot == null || root.data != subRoot.data)
            return false;

        if(!isIdentical(root.left, subRoot.left))
            return false;
        if(!isIdentical(root.right, subRoot.right))
            return false;
        
        return true;

    }

    public static boolean isSubTree(Node root, Node subRoot) {
        if(root == null)
            return false;

        if(root.data == subRoot.data) {
            if(isIdentical(root,subRoot))
                return true;
        }
        // boolean leftAns = isSubTree(root.left, subRoot);
        // boolean rightAns = isSubTree(root.right, subRoot);
        // return leftAns || rightAns;

        // It is better to right like this. If the first becomes true then the next will not be checked.
        return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.right = new Node(6);

        Node subNode = new Node(2);
        subNode.right = new Node(5);
        subNode.left = new Node(4);
        // subNode.left.left = new Node(4);

        Node root2 = new Node(3);
        root2.left = new Node(4);
        root2.left.left = new Node(1);
        root2.left.right = new Node(2);
        root2.right = new Node(5);

        Node subNode2 = new Node(4);
        subNode2.right = new Node(2);
        subNode2.left = new  Node(1);

        System.out.println(check(root2, subNode2));
    }
}
