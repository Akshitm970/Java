package tree.LevelOrderTraversal;

public class MaximumInBinaryTree{
Node root;

public static void main(String[] args) {
    MaximumInBinaryTree tree = new MaximumInBinaryTree();

    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(5);

    System.out.println(Maxi(tree.root));

}
public static int Maxi(Node root){
    if (root == null) return Integer.MIN_VALUE;
    return Math.max(root.data,Math.max(Maxi(root.left), Maxi(root.right)));
//    return root.data;
}
}
