package hashset;

import java.util.HashSet;

public class removeElementsUsingHashSet {
    public static void main(String[] args) {
        int[] a = {11, 1, 13, 21, 3, 7};
        int[] b = { 11, 3, 7, 1};
        HashSet<Integer> set = new HashSet<>();
        for(int i :a){
            set.add(i);
        }
        for(int i :b){
            if(set.contains(i)){
                set.remove(i);
            }
        }
        System.out.println(set);
    }
}
