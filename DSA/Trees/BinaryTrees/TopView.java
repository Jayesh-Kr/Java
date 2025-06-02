package DSA.Trees.BinaryTrees;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TopView {
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

    static class Info {
        Node node;
        int hd;
        Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root) {

        Queue<Info> q = new LinkedList<>();
        HashMap<Integer,Node> hp = new HashMap<>();

        int maxIdx = 0;
        int minIdx = 0;

        q.add(new Info(root, 0));
        q.add(null);

        while(!q.isEmpty()) {
            Info currNode = q.remove();
            if(currNode == null) {
                if(q.isEmpty())
                    break;
                else
                    q.add(null);
            } else {
                if(!hp.containsKey(currNode.hd))
                    hp.put(currNode.hd, currNode.node);
                
                if(currNode.node.left != null) {
                    q.add(new Info(currNode.node.left , currNode.hd-1));
                    minIdx = Math.min(currNode.hd-1, minIdx);
                }
                if(currNode.node.right != null) {
                    q.add(new Info(currNode.node.right, currNode.hd+1));
                    maxIdx = Math.max(currNode.hd+1, maxIdx);
                }
            }            
        }
        
        for(int i = minIdx; i <= maxIdx; i++)
            System.out.print(hp.get(i).data + " ");
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        topView(root);
    }
}
