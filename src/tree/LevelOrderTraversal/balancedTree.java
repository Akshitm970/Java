package tree.LevelOrderTraversal;

public class balancedTree {
    Node root;
    public static void main(String[] args) {
        balancedTree tree = new balancedTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.left.left = new Node(8);

        if (tree.isBalanced(tree.root))
            System.out.println("Tree is balanced");
        else
            System.out.println("Tree is not balanced");
    }
    public boolean isBalanced(Node root) {
        if (root == null){
            return true;
        }
        int lt = height(root.left);
        int rt = height(root.right);

        return 1<=Math.abs(lt - rt) && isBalanced(root.left) && isBalanced(root.right);
    }
    public int height(Node root) {
        if (root == null){
            return 0;
        }
    return 1+ Math.max(height(root.left), height(root.right));
    }
}
