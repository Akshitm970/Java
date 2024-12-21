package LinkedList;

import java.util.LinkedList;

public class LinkedListAdd {
    public static void main(String[] args) {
        LinkedList<Integer> a = new LinkedList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        System.out.println(a);
        a.add(6);
        a.add(7);
        System.out.println(a);
        LinkedList<String> b = new LinkedList<>();
        b.add("a");
        b.add("b");
        b.add("c");
        b.add("d");
        b.add("e");
        System.out.println(b);
    }
}
