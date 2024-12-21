package LinkedList;

import java.util.LinkedList;

public class LinkedListAddFirstLast {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list);
        list.addFirst("First");
        list.addFirst("At");
        System.out.println(list);
        list.addLast("At");
        list.addLast("Last");
        System.out.println(list);
    }
}
