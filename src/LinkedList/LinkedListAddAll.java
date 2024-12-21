package LinkedList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class LinkedListAddAll {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        Collection<String> collect = new ArrayList<>();
        collect.add("E");
        collect.add("F");
        collect.add("G");
        collect.add("H");
        System.out.println("Old list "+list);
//        list.addAll(collect);
//        System.out.println("New list "+list);



        list.addAll(1,collect);
        System.out.println("New list where index1 : "+list);
    }
}
