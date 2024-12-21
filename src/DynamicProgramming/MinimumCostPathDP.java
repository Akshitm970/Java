package DynamicProgramming;

public class MinimumCostPathDP {
    public static void main(String[] args) {
        int m = 2;
        int n = 2;
        int[][] arr = {{3,1},{4,3}};
//        System.out.println(arr[0].length);
        int[][] dp = new int[m][n];
//        System.out.println(dp[0].length);
        for(int i = dp.length-1;i>=0;i--){
            for (int j = dp.length-1;j>=0;j--){
                if(i == dp.length-1 && j == dp[0].length-1){
                    dp[i][j] = arr[i][j];
                }else if(i==dp.length-1){
                    dp[i][j] = dp[i][j+1]+arr[i][j];
                }else if(j == dp[0].length-1){
                    dp[i][j] = dp[i+1][j]+arr[i][j];
                }
                else{
                    dp[i][j] = Math.min(dp[i+1][j],dp[i][j+1])+arr[i][j];
                }
            }
        }
        System.out.println(dp[0][0]);
    }
}
