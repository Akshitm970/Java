package hashset;

import java.util.HashSet;

public class intersectionUsingHashSet {
    public static void main(String[] args) {
        int[] a = {11, 1, 13, 21, 3, 7};
        int[] b = { 11, 3, 7, 1};
        HashSet<Integer> set = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
        int[] arr = new int[set2.size()];
        for(int i : a){
            set.add(i);
        }
        for(int i : b){
            if(set.contains(i)){
                set2.add(i);
            }
        }
        for(int i = 0;i<arr.length;i++){
//            arr[i]=set2.toArray();
        }
        System.out.println(arr[0]+arr[1]+arr[2]+arr[3]);
//        int[] num = new int[set2.size()];
//        num = set2.toArray(num.length());
    }
}
