package Stack;

import java.util.Stack;

public class displayStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
//        System.out.println(st);
//        Stack<Integer> rt = new Stack<Integer>();
//        while (st.size() > 0) {
//            rt.push(st.pop());
//        }
//        while (rt.size() > 0) {
//            System.out.print(rt.peek());
//            st.push(rt.pop());
//        }
//        displayReverseRec(st);
        displayRec(st);
    }

    public static void displayReverseRec(Stack<Integer> st) {
        if (st.size() == 0) {return;}
        System.out.println(st.peek());
        int n = st.pop();
        System.out.println(st.peek());
        displayReverseRec(st);
        st.push(n);

    }
    public static void displayRec(Stack<Integer> st) {
        if (st.size() == 0) {return;}
        int n = st.pop();
        displayRec(st);
        System.out.println(n);
        st.push(n);
        System.out.println(st);
    }
}
