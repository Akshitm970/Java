package DynamicProgramming;

public class climbStaisWithVariableJumps {
    public static void main(String[] args) {
//        int n = 13;
        int[] arr = {5,5,2,4,1,5,9,8,6,3,8,9,1};
        int[] dp = new int[arr.length+1];
        dp[arr.length] = 1;
        for (int i = arr.length-1; i >= 0; i--) {
            for (int j = 1; j <= arr[i] && i+j<dp.length; j++) {
                dp[i] += dp[i+j];
            }
        }
        System.out.println(dp[0]);
    }
}
