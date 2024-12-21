package tree.LevelOrderTraversal;

import java.util.LinkedList;
import java.util.Queue;

public class levelOrder {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static void levelOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();
                System.out.print(current.val + " "); // Print the node value

                // Add children to queue for next level traversal
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
            System.out.println(); // Print a new line after each level
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(5);
        root.right.left = new TreeNode(5);
//        root.left.left.left = new TreeNode(5);
//        root.right.right.right = new TreeNode(5);
//        root.left.left.right = new TreeNode(5);
//        root.left.right.left.left = new TreeNode(5);

        System.out.println("Level Order Traversal:");
        levelOrder(root);
    }
}
