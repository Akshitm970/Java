package DynamicProgramming;

class Node{
    int data;
    Node left,right;
    public Node(int d){
        data = d;
        right = left = null;
    }
}
public class RootToLeaf {
    Node root;
    public static void main(String[] args) {
        RootToLeaf tree = new RootToLeaf();
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(2);

        /* Let us test the built tree by printing Inorder traversal */
        tree.printPaths(tree.root);
    }
    public void printPaths(Node root) {

    }
}
