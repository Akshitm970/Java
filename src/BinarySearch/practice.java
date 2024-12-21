package BinarySearch;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class practice {
    public static void main(String[] args) {
        int[] arr = {-1,1,2,3,1};
//        int find = 5;
//        int start = 0;
//        int end = arr.length-1;
//        while(start <= end) {
//        int mid = start+(end-start)/2;
//            if(arr[mid]==find) {
//                System.out.println(mid);
//                break;
//            }else if(arr[mid]>find) {
//                end = mid-1;
//            }else{
//                start = mid+1;
//            }
//        }
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++) {
            list.add(arr[i]);
        }
        System.out.println(countPairs(list,2));
//        countPairs s  = new countPairs
    }
    public static int countPairs(List<Integer> nums, int target) {
        int count = 0;
//        for(int i = 0;i<nums.size();i++){
//            for(int j = i+1;j<nums.size();j++){
//                if(i<j && nums.get(i)+nums.get(j)<target){
//                    count++;
//                }
//            }
//        }
        nums.sort((a,b)->b-a);
        System.out.println(nums);
        Collections.sort(nums);
        System.out.println(nums);
        Collections.reverse(nums);
        System.out.println(nums);
        return count;
    }
}
