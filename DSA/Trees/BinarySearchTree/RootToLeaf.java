package DSA.Trees.BinarySearchTree;

import java.util.ArrayList;

public class RootToLeaf {
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
    
    public static void printList(ArrayList<Integer> list) {

        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
    public static void rootToLeaf(Node root, ArrayList<Integer> list) {
        if(root == null)
            return;
        list.add(root.data);
        if(root.left == null && root.right == null)
            printList(list);

        rootToLeaf(root.left, list);
        rootToLeaf(root.right, list);

        list.remove(list.size()-1);
    }

    public static void main(String[] args) {
        int arr[] = { 5, 1, 3, 4, 2, 7 };

        Node root = null;
        for (int i = 0; i < arr.length; i++) {
            root = createBST(root, arr[i]);
        }
        ArrayList<Integer> list = new ArrayList<>();
        rootToLeaf(root, list);
    }
}
