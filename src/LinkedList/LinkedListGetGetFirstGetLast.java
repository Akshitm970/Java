package LinkedList;

import javax.management.MXBean;
import java.util.LinkedList;

public class LinkedListGetGetFirstGetLast {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println("get first "+list.getFirst());
        System.out.println("get last"+list.getLast());

    }
}
