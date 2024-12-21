package CollectionFrameWork;

import java.util.*;

public class ListInterfaceExamples {
    public static void main(String[] args) {
        ArratlistExample();
        LinkedlistExample();
        StackExample();
    }
    static void ArratlistExample(){
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l);
        System.out.println(l.get(0));
        System.out.println(l.contains(10));
    }
    static void LinkedlistExample(){
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l);
        System.out.println(l.get(0));
        System.out.println(l.contains(10));
    }
    static void StackExample(){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.size());
        System.out.println(s.empty());

    }
}
