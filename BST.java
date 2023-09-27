public class BST{
    class Node  {
        int data;
        Node Left;
        Node Right;

        Node(int data) {
            this.data = data;
        }
        }

    public static Node insert(Node root, int val) {
       if(root == null) {
           root = new Node(val);  
           return root;
        }

        if(root.data >val) {
            root.Left = insert(root.Left, val);
        } else {
            root.Right = insert(root.Right, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if(root == null) {
            return;
        }
        inorder(root.Left);
        System.out.println(root.data +" ");
        inorder(root.Right);
    }

    public static void main(String[] args) {
        int values [] = {5,1,3,4,2,7};
        Node root = null;

        for(int i=0; i<values.length; i++) {
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();
    }
}