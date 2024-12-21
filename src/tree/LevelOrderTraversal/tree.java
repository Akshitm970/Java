package tree.LevelOrderTraversal;

import java.util.Scanner;

public class tree {
    static Scanner sc = null;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = createTree();
        InOrder(root);
        System.out.println();
        PreOrder(root);
        System.out.println();
        PostOrder(root);
        System.out.println();


    }
    public static Node createTree(){
        Node root = null;
        System.out.println("Enter data");
        int data = sc.nextInt();
        if(data == -1){
            return null;
        }
        root = new Node(data);

        System.out.println("Enter data for left");
        root.left = createTree();
        System.out.println("Enter data for right");
        root.right = createTree();

        return root;
    }
    public static void PreOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        PreOrder(root.left);
        PreOrder(root.right);

    }
    static void InOrder(Node root){
        if(root == null){
            return;
        }
        InOrder(root.left);
        System.out.print(root.data + " ");
        InOrder(root.right);

    }
    public static void PostOrder(Node root){
        if(root == null) {
            return;
        }
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.println(root.data);
    }
}
class Node{
    Node left, right;

    int data;
    public Node(int data) {
        this.data = data;
    }
}
