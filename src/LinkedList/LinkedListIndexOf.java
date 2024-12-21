package LinkedList;

import java.util.LinkedList;

public class LinkedListIndexOf {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list);
        System.out.println(list.indexOf("D"));
    }
}
