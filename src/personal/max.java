package personal;

import java.util.Arrays;

public class max {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int[] arr = {10, 10};
        Arrays.sort(arr);
        System.out.println(arr);
        
        System.out.println(arr[arr.length-1]);
//        for(int i=0; i<arr.length; i++) {
//            if(arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println(max);
    }
}
