package Stack;

import java.util.ArrayList;

public class StackUsingArrayList {
    public static void main(String[] args) {
        StackClassUsingLinkedList.Stack s = new StackClassUsingLinkedList.Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

            System.out.println(s.peek());
        while (!s.isEmpty()){
            System.out.println(s.pop());
        }

    }
    class Stack{
        static ArrayList<Integer> list = new ArrayList();
        public static boolean isEmpty(){
            return list.size() == 0;
        }
        public static void push(int x){
            list.add(x);
        }
        public static int pop(){
            if (list.isEmpty()){
//                System.out.println("Stack is empty");
            return -1;
            }
            return list.remove(list.size()-1);
        }
        public static int peek(){
            if (list.isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
}
