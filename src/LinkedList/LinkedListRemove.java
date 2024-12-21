package LinkedList;

import java.util.LinkedList;

public class LinkedListRemove {
    public static void main(String[] args) {
        LinkedList<String> b = new LinkedList<>();
        b.add("a");
        b.add("b");
        b.add("c");
        b.add("d");
        b.add("e");
        System.out.println(b);
        b.remove();
        System.out.println(b);
    }
}
