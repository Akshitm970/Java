package personal;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int nums1[] = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1,m,nums2,n);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> as = new ArrayList<>();
        for(int i = 0; i < m; i++) {
        as.add(nums1[i]);
        }
        for(int i = 0; i < m; i++) {
            as.add(nums2[i]);
        }
        System.out.println(as);
        Object[] ar =  as.toArray();
        Arrays.sort(ar);
        for(Object i:ar){
        System.out.println(i);
        }

    }
    public static void merge1(int[] nums1, int m, int[] nums2, int n) {

        for(int i = 0; i < n; i++) {
            nums1[m+i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}
