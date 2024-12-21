package DynamicProgramming;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";
        int m = s1.length();
        int n = s2.length();
//        int[][] dp = new int[m + 1][n + 1];
//        for (int i = 1; i <= m; i++) {
//            for (int j = 1; j <= n; j++) {
//                dp[i][j] = -1;
//            }
//        }
//        System.out.println(LCSUsingMemoization(s1,s2,m,n,dp));
//        System.out.println(LCSUsingTabulation(s1,s2,m,n));
//        System.out.println(lcs(s1, s2, m, n));
        System.out.println(lcsdp(s1, s2, m, n));

    }
    public static int LCSUsingMemoization(String s1, String s2, int m, int n, int[][] dp) {
        if(m == 0|| n == 0) return 0;
        if(dp[m][n] != -1) return dp[m][n];
        if(s1.charAt(m - 1) == s2.charAt(n - 1)) {
            dp[m][n] =1+ LCSUsingMemoization(s1, s2, m - 1, n - 1, dp);
            return dp[m][n];
        }
        dp[m][n] = Math.max(LCSUsingMemoization(s1,s2,m-1,n,dp),LCSUsingMemoization(s1,s2,m,n-1,dp));
        return dp[m][n];
    }
    public static int LCSUsingTabulation(String s1, String s2, int m, int n) {
        int[][] l = new int[m + 1][n + 1];
        for (int i = 0;i<=m;i++){
            for (int j = 0;j<=n;j++){
                if(i == 0 || j == 0) {
                    l[i][j] = 0;
                }
                else if (s1.charAt(i-1) == s2.charAt(j-1)) {
                    l[i][j] = 1 + l[i-1][j-1];
                }
                else{
                   l[i][j]= Math.max(l[i-1][j],l[i][j-1]);
                }
            }
        }
        return l[m][n];
    }
    public static int lcs(String s1, String s2,int m,int n) {
        if(m ==0 || n == 0){
            return 0;

        }
        if(s1.charAt(m-1)==s2.charAt(n-1)){
            return 1+lcs(s1,s2,m-1,n-1);
        }
        int r = lcs(s1,s2,m-1,n);
        int c = lcs(s1,s2,m,n-1);
        return Math.max(r,c);
    }

    public static int lcsdp(String s1,String s2, int m, int n) {

        int[][] dp = new int[m + 1][n + 1];

        if (m == 0 || n == 0) return 0;
        if(s1.charAt(m-1)==s2.charAt(n-1)){
            dp[m][n]=1+lcsdp(s1, s2, m-1, n-1);
        return dp[m][n];
        }
//        int c = lcsdp(s1,s2,m-1,n);
//        int d = lcsdp(s1,s2,m,n-1);
//        return Math.max(d,c);
        dp[m][n] = Math.max(dp[m-1][n],dp[m][n-1]);
        return dp[m][n];
    }
}
