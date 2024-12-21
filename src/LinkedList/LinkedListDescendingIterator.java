package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDescendingIterator {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);
        Iterator x = list.descendingIterator();
        while (x.hasNext()) {
            System.out.println(x.next());
        }
    }
}
