package LinkedList;

import java.util.LinkedList;

public class LinkedListSet {
    public static void main(String[] args) {
        LinkedList<String> s  = new LinkedList<>();
        s.add("Hello");
        s.add("World");
        s.add("is here");
        System.out.println(s);
        s.add(2,"Akshit");
        System.out.println(s);
        s.set(2,"Akshit Mittal");
        System.out.println(s);
        s.set(3,"age 22");
        System.out.println(s);
    }
}
