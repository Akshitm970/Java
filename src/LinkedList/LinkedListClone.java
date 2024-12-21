package LinkedList;

import java.util.LinkedList;

public class LinkedListClone {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list);
        LinkedList<String> clone = new LinkedList<>();
        clone = (LinkedList) list.clone();
        System.out.println(clone);
    }
}
