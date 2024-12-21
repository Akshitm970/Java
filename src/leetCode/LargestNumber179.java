package leetCode;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber179 {

    public static void main(String[] args) {
        int nums[] = {10,2};
        System.out.println(largestNumber(nums));
    }
    public static String largestNumber(int[] nums) {
        String elements[] = new String[nums.length];
        for(int i= 0;i<nums.length;i++){
            elements[i] = Integer.toString(nums[i]);
        }
        Arrays.sort(elements,new Comparator<String>(){
            public int compare(String a,String b){
                String first = a+b;
                String sec = b+a;
                return sec.compareTo(first);
            }
        });
        if(elements[0].equals("0")){
            return "0";
        }
        String res="";
        for(String val: elements){
            res += val;
        }
        return res;
    }
}

