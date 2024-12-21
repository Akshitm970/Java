package hashset;

import java.util.Arrays;
import java.util.HashSet;

public class UniounUsingHash {
    public static void main(String[] args) {
        int[] a = {11, 1, 13, 21, 3, 7};
        int[] b = { 11, 3, 7, 1};
        HashSet<Integer> union = new HashSet<>();
        for(int i : a){
            union.add(i);
        }
        for(int i : b){

            union.add(i);
        }
        System.out.println(union);
        Arrays.sort(a);
        int m = a.length;
    }
}
