package LinkedList;

import java.util.LinkedList;

public class LinkedListLastIndexOf {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("A");
        list.add("C");
        System.out.println(list);
        System.out.println(list.lastIndexOf("A"));
    }
}
