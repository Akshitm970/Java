package personal;

import java.util.Arrays;

public class gcd {
    public static void main(String[] args) {
        int[] arr = {7,5,6,8,3};
        System.out.println(findGCD(arr));
    }
    public static int findGCD(int[] nums) {
        Arrays.sort(nums);
        int largest = nums[nums.length-1];
        int smallest = nums[0];
        for(int i = smallest;i>0;i--){
            if(largest%i==0 && smallest%i==0){
                return i;
                // break;
            }else{
                continue;
            }

        }
        return 1;
    }
}
