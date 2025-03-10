package DynamicProgramming;

public class climbStairsWithMinimumMoves {
    public static void main(String[] args) {
        int[] arr = {1,1,1,4,9,8,1,1,10,1};
        Integer[] dp = new Integer[arr.length+1];
        dp[arr.length] = 0;
        for (int i = arr.length-1;i>=0;i--){
            if (arr[i]>0){
                int min = Integer.MAX_VALUE;
                for (int j = 1;j<=arr[i] && i+j <dp.length;j++){
                    if(dp[i+j]!=null){
                        min = Math.min(min,dp[i+j]);
                    }
                }
                if(min!=Integer.MAX_VALUE){
                    dp[i] = min+1;
                }
            }
        }
        System.out.println(dp[0]);
    }
}
