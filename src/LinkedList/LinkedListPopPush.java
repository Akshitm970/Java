package LinkedList;

import java.util.LinkedList;

public class LinkedListPopPush {
    public static void main(String[] args) {
        LinkedList<String> stack = new LinkedList<>();

        stack.push("Geeks");
        stack.push("for");

        String s = stack.pop();

        System.out.println(s);

        stack.push("Geeks");
        System.out.println(stack);
    }
}
