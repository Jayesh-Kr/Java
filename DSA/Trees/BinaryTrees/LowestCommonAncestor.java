package DSA.Trees.BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;

public class LowestCommonAncestor {
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

    public static boolean findList(Node root, int n, ArrayList<Node> list) {
        if(root == null)
            return false;

        list.add(root);

        if(root.data == n)
            return true;


        boolean leftSide = findList(root.left, n, list);
        boolean rightSide = findList(root.right, n, list);

        if((leftSide || rightSide))
            return true;
        
        list.remove(list.size()-1);

        return false; 
    }

    public static Node findLowestAnc(Node root, int n1, int n2) {

        ArrayList<Node> list1 = new ArrayList<>();
        ArrayList<Node> list2 = new ArrayList<>();
        findList(root,n1,list1);
        findList(root,n2,list2);

        int i;
        for(i=0; i < list1.size() && i < list2.size(); i++) {
            if(list1.get(i) != list2.get(i))
                break;
        }

        Node res = list1.get(i-1);
        return res;

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
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // Node ans = findLowestAnc(root, 4, 5);
        // System.out.println(ans.data);
        Node ans = lca(root, 4, 5);
        System.out.println(ans.data);
    }
}
