package DynamicProgramming;

public class CountNumberOfWays {
    public static void main(String[] args) {
        int col = 5;
        int row = 5;
//        System.out.println(numOfWays(col,row));
        System.out.println(numOfWays1(col, row));
    }
    public static int numOfWays(int n,int m) {
//        if(m == 0 && n == 0)return 0;
        if(n == 1 || m == 1)return 1;
        int x = numOfWays(n-1,m);
        int y = numOfWays(n,m-1);
        return x+y;
    }
    public static int numOfWays1(int n,int m){
        int[][] dp = new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1 ||j==1)dp[i][j]=1;
                else dp[i][j]= dp[i][j-1]+dp[i-1][j];
            }
        }
        return dp[n][m];
    }
}
