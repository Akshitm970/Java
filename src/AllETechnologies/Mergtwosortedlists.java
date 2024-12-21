package AllETechnologies;

import java.util.ArrayList;
import java.util.List;

public class Mergtwosortedlists {
    public static void main(String[] args){
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(7);
        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(6);
        List<Integer> list3 = mergeTwoLists(list1, list2);
        System.out.println(list3);
    }
    public static List<Integer> mergeTwoLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> list3 = new ArrayList<>();
        int i = 0, j = 0;
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                list3.add(list1.get(i));
                i++;
            } else {
                list3.add(list2.get(j));
                j++;
            }
        }
        while (i < list1.size()) {
            list3.add(list1.get(i));
            i++;
        }
        while (j < list2.size()) {
            list3.add(list2.get(j));
            j++;
        }
        return list3;
    }
}
