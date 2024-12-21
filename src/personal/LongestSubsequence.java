package personal;

public class LongestSubsequence {
    public static void main(String[] args) {
        LongestSubsequence ls = new LongestSubsequence();
//        ls.longestCommonSubsequence("abcde","abc");
        System.out.println(ls.longestCommonSubsequence("abcde","abc"));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        // char[][] dp= new char[text1.length()][text2.length()];
        char[] st1 = text1.toCharArray();
        char[] st2 = text2.toCharArray();
        int[][] dp = new int[st1.length + 1][st2.length + 1];
        for (int i = 0; i <= st1.length; i++) {
            for (int j = 0; j <= st2.length; j++) {
                if (st1[i] == st2[j]) {
                    dp[i][j] = Math.max(dp[i][j -1],dp[i-1][j]) + 1;
                }
                else {
                    dp[i][j] = Math.max(dp[i][j -1],dp[i-1][j]);
                }
            }
        }
        return dp[st1.length][st2.length];

    }
}
