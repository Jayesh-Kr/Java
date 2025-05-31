package DSA.Trees.BinaryTrees;

public class Diameter {
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
        int ht;
        int dia;
        Info(int height, int diameter) {
            this.dia = diameter;
            this.ht = height;
        }
    }

    static class BinaryTree {

        public static int height(Node root) {
            if (root == null)
                return 0;

            int leftHeight = height(root.left);
            int rightHeight = height(root.right);

            return Math.max(leftHeight, rightHeight) + 1;
        }

        public static int diameter(Node root) {
            if (root == null)
                return 0;

            int leftDia = diameter(root.left);
            int rightDia = diameter(root.right);
            int selfDia = height(root.left) + height(root.right) + 1;

            return Math.max(selfDia, Math.max(rightDia, leftDia));
        }

        public static Info diameter2(Node root) {
            if(root == null)
                return new Info(0, 0);
            
            Info leftInfo = diameter2(root.left);
            Info rightInfo = diameter2(root.right);

            int diameter = Math.max(Math.max(leftInfo.dia, rightInfo.dia), (leftInfo.ht + rightInfo.ht + 1));
            int height = Math.max(leftInfo.ht, rightInfo.ht) + 1;

            return new Info(height, diameter);
        }
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Max Diameter is : " + bt.diameter(root)); // O (n^2)
        System.out.println("Max Diameter is : " + bt.diameter2(root).dia); 
        // NOTE :-
        // In the diamerter2 fnc we are calculating diameter and height of the node at the same time - Therefore the time complexity is O (n)
        // For diameter() function we have to calculate the height and diameter for each node which take O(n). So it n+n+n+n+n... => O (n^2)
    }
}
