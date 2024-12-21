package DynamicProgramming;

public class PathWithMaximumGoldDP {
    public static void main(String[] args) {
        int n = 2;
        int m = 2;
        int[][] arr = {{2,3},{4,5}};
        int[][] dp = new int[n][m];
        for(int j = arr[0].length-1;j>=0;j--){
            for(int i = arr.length-1;i>=0;i--){
                if(j == arr[0].length-1){
                    dp[i][j] = arr[i][j];
                }
                else if(i == 0){
                    dp[i][j] = arr[i][j]+Math.max(dp[i][j+1],dp[i+1][j+1]);
                }
                else if(i == dp.length-1){
                    dp[i][j] = arr[i][j]+Math.max(dp[i][j+1],dp[i-1][j+1]);
                }else {
                    dp[i][j] = arr[i][j]+ Math.max(dp[i-1][j],Math.max(dp[i][j+1],dp[i+1][j+1]));
                }
            }
        }
            int max= dp[0][0];
//        for (int j = arr[0].length-1;j>=0;j--){
            for (int i = 1;i<dp.length;i++){
                if(dp[i][0]>max){
                max = dp[i][0];
                }
            }
//        }
        System.out.println(max);
    }
}
