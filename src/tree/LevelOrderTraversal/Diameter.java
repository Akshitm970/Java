package tree.LevelOrderTraversal;

public class Diameter {
    public static void main(String[] args) {

        Node root = newNode(1);
        root.left = newNode(2);
        root.right = newNode(3);
        root.left.left = newNode(4);
        root.left.right = newNode(5);

        System.out.println("Diameter is " + diameter(root));
    }
    static int diameter(Node root)
    {
        if (root == null)
            return 0;

        // This will store the final answer
        A a = new A();
        int height_of_tree = height(root, a);
        return a.ans;
    }
    static Node newNode(int data)
    {
        Node node = new Node(data);
        node.data = data;
        node.left = null;
        node.right = null;

        return (node);
    }
    static class A
    {
        int ans = Integer.MIN_VALUE;
    }
    static int height(Node root, A a)
    {
        if (root == null)
            return 0;

        int left_height = height(root.left, a);

        int right_height = height(root.right, a);
        a.ans = Math.max(a.ans, 1 + left_height +
                right_height);

        return 1 + Math.max(left_height, right_height);
    }
}
