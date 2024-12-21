package tree.LevelOrderTraversal;
//class Node {
//            int data;
//        Node left, right;
//
//        Node(int item)
//        {
//            data = item;
//            left = right = null;
//        }
//    }
public class MyTest {
    public static void main(String[] args) {
        MyTest obj = new MyTest();
        Node r = obj.createSampleTree();
//        obj.InOrder(r);
//        System.out.println(obj.sumExist(r,21));
//        System.out.println(obj.PartrialPathSumIsTrue(r,2));
        int[] arr = new int[6];
        int n = 6;
        obj.printAllPathsInBinaryTree(r,arr,n);
    }
    Node createSampleTree(){
        Node r = new Node(10);
        r.left = new Node(8);
        r.right = new Node(20);
        r.right.left = new Node(16);
        r.right.right = new Node(40);
        r.left.left = new Node(2);
        r.right.left.right = new Node(18);

        return r;
    }
    void InOrder(Node r){
        if(r == null) return;
        InOrder(r.left);
        System.out.print(r.data + " ");
        InOrder(r.right);
    }
    boolean sumExist(Node r,int k){
        if(r == null && k != 0) return false;
        if(r== null && k == 0) return true;
        boolean s = sumExist(r.left,k-r.data);
        boolean l = sumExist(r.right,k-r.data);
//        if(k == r.data) return true;

        return s || l;
    }


    boolean PartrialPathSumIsTrue(Node r,int k){
        if(r == null && k != 0) return false;
        if (r == null && k == 0) return true;
        boolean s = PartrialPathSumIsTrue(r.left,k-r.data);
        boolean l = PartrialPathSumIsTrue(r.right,k-r.data);
        if(k == r.data){
            return true;
        }
        return s || l;
    }

//    Node printAllPathsInBinaryTree(Node r){
//        Node m = new Node(r.data);
//        if(r == null) return null;
//
//        if(r.left == null && r.right == null){
//            return null;
//        }
//
//        m.left = printAllPathsInBinaryTree(r.left);
//        m.right = printAllPathsInBinaryTree(r.right);
//        return m;
//    }

    void printAllPathsInBinaryTree(Node r,int[] path,int n){
        if (r == null) return;
        path[n] = r.data;
        if(r.left == null && r.right == null){
            for (int i = 0;i<=n;i++){
                System.out.println(path[i]);
            }
            return;
        }
        printAllPathsInBinaryTree(r.left,path,n+1);
        printAllPathsInBinaryTree(r.right,path,n+1);

    }
}
