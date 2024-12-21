package hashset;

import java.util.HashMap;
import java.util.HashSet;

public class SubsetChecker {
    public static void main(String[] args) {
        int[] a = {11, 1, 13, 21, 3, 7};
        int[] b = { 11, 3, 7, 1};

        System.out.println(isSubsetUsingHashing(a,b));
    }
    public static boolean isSubsetUsingHashing(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int num:a){
            set.add(num);
        }
        for(int num:b){
            if (set.contains(num)){
                return true;
            }
        }
        return false;
    }
}
