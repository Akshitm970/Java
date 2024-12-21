package tree.LevelOrderTraversal;

public class SIZEOfTree {
        Node root;
    public static void main(String[] args) {
        SIZEOfTree tree = new SIZEOfTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Size of tree is "
                + sizeOfTree(tree.root));
    }
    static int sizeOfTree(Node root) {
        if(root == null)
            return 0;

        return sizeOfTree(root.left) + sizeOfTree(root.right) + 1;
    }
}
