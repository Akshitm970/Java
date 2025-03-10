package tree.LevelOrderTraversal;


import com.sun.source.tree.BinaryTree;

//class Node {
//        int data;
//        Node left, right;
//
//        Node(int item)
//        {
//            data = item;
//            left = right = null;
//        }
//    }
class height {
    Node root;
    int maxDepth(Node node)
    {
        if (node == null)
            return 0;

        else return Math.max(maxDepth(node.left),maxDepth(node.right))+1;
    }
    public static void main(String[] args)
    {
        height tree = new height();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Height of tree is "
                + tree.maxDepth(tree.root));
    }
}
