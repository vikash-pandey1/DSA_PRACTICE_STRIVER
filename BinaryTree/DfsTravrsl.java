package BinaryTree;
class Node{
    int data;
    Node left,right;
    public Node(int key){
        data = key;
    }
}
public class DfsTravrsl {
    public static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    public static void preorder(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            preorder(root.left);
            
            preorder(root.right);
        }
    }public static void postorder(Node root){
        if(root!=null){
            postorder(root.left);
            
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println("   inorder ");
        inorder(root);
        System.out.println();
        System.out.println("   preorder");
        preorder(root);
        System.out.println();
        System.out.println("  postorder");
        postorder(root);
    }
}
