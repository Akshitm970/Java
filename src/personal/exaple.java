package personal;

import static java.lang.Math.abs;
//import static sun.util.calendar.CalendarUtils.mod;

public class exaple {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println(Integer.min(a,b));
        if(Math.abs(a-b)<=Integer.min(a,b));
        System.out.println();
//        maximumStrongPairXor s = new maximumStrongPairXor(
//       )
        int[] a1 = {1,2,4};
        exaple s = new exaple();
        System.out.println(s.maximumStrongPairXor(a1));
    }
    public int maximumStrongPairXor(int[] nums) {
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            for(int j = i;j<nums.length;j++){
                if(Math.abs(nums[i]-nums[j])<=Integer.min(nums[i],nums[j])){
                    count++;
                }
                else{
                    break;
                }
            }
        }
        return count;
    }
}
