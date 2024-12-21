package Stack;

import java.util.Scanner;
import java.util.Stack;

public class moveStackInSameOrder {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
//        int n ;
//        System.out.println("Enter the number of elements you want to insert");
//        n = sc.nextInt();
//        System.out.println("Enter the elements : ");
//        for (int i = 0; i < n; i++) {
//            int x = sc.nextInt();
//            st.push(x);
//        }
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println("st : "+st);

        Stack<Integer> gt = new Stack<>();
        while (st.size()>0){
//            int x= st.peek();
//            rt.push(x);
//            st.pop();
            gt.push(st.pop());
        }
        System.out.println("gt : "+gt);

        Stack<Integer> rt = new Stack<>();
        while (gt.size()>0){
            rt.push(gt.pop());
        }
        System.out.println("rt : "+rt);
    }
}
