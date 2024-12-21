package LinkedList;

import java.util.LinkedList;

public class LinkedListSize {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);
        System.out.println(list.size());
    }
}
