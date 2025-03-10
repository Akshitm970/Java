package leetCode;

//import java.lang.classfile.components.ClassPrinter;

public class MergeTwoSortedList21 {
    public static void main(String[] args) {

    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode temp_node = new ListNode(0);
        ListNode curr = temp_node;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                curr.next = l1;
                l1 = l1.next;
            }else{
                curr.next = l2;
                l2 = l2.next;
        }
            curr = curr.next;
        }
        if (l1 != null) {
            curr.next = l1;
            l1 = l1.next;
        }
        if (l2 != null) {
            curr.next = l2;
            l2 = l2.next;
        }
        return temp_node.next;


    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
}
