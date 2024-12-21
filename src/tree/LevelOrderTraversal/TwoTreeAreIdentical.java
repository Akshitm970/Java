package tree.LevelOrderTraversal;


//class Node{
//    int data;
//    Node left,right;
//    Node (int item){
//        data = item;
//        left = right = null;
//    }
//}
public class TwoTreeAreIdentical {
    Node root1;
    Node root2;

    public static void main(String[] args) {
        TwoTreeAreIdentical tree = new TwoTreeAreIdentical();

        tree.root1 = new Node(1);
        tree.root1.left = new Node(2);
        tree.root1.right = new Node(3);
        tree.root1.left.left = new Node(4);
        tree.root1.left.right = new Node(5);

        tree.root2 = new Node(1);
        tree.root2.left = new Node(2);
        tree.root2.right = new Node(3);
        tree.root2.left.left = new Node(4);
        tree.root2.left.right = new Node(5);

        // Function call
        if (tree.identicalTrees(tree.root1, tree.root2))
            System.out.println("Both trees are identical");
        else
            System.out.println("Trees are not identical");
    }
    boolean identicalTrees(Node root1, Node root2) {
        if (root1 == null && root2 == null){
            return true;
        }
        if(root1 != null && root2 != null){
            return root1.data == root2.data && identicalTrees(root1.left, root2.left) && identicalTrees(root1.right,root2.right);
        }

        return false;
    }
}
