package LinkedList;

import java.util.LinkedList;

public class LinkedListClear
{
    public static void main(String[] args) {
        LinkedList<String> b = new LinkedList<>();
        b.add("a");
        b.add("b");
        b.add("c");
        b.add("d");
        b.add("e");
        System.out.println("Linked list before clear : "+b);
        b.clear();
        System.out.println("linked list after clear : "+b);
    }
}
