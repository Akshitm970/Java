package tree.LevelOrderTraversal;

public class SymmetricTree {
    Node root;
    public static void main(String[] args) {
        SymmetricTree tree = new SymmetricTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(4);
        tree.root.right.left = new Node(4);
        tree.root.right.right = new Node(3);
        boolean output = tree.isSymmetric(tree.root);
        if (output == true)
            System.out.println("Symmetric");
        else
            System.out.println("Not symmetric");
    }
    public boolean isSymmetric(Node root) {

        return isMirror(root,root);
    }
    public boolean isMirror(Node n1, Node n2) {
        if (n1 == null && n2 == null)
            return true;
        if (n1== null &&  n2 == null && n1.data==n2.data){
                 return isMirror(n1.left, n2.left) && isMirror(n1.right, n2.right);
        }
    return false;
    }
}
