package LinkedList;

import java.util.LinkedList;

public class LinkedListElement {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        int value = list.element();
        System.out.println(value);//it give the output as the head of the linked list
    }
}
