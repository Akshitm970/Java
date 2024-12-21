package personal;

import java.util.*;

public class MinimumFallingPathSum {
    public static void main(String[] args) {
        String[] arr = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
//        int a = mostWordsFound(arr);
        int a = arr[0].split("\\s").length;
        System.out.println(a);

    }
    public int minFallingPathSum(int[][] matrix) {

            int ans = Integer.MAX_VALUE;
        for(int i = 1;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                matrix[i][j] += Integer.min(matrix[i-1][j],Integer.min(matrix[i-1][j-1],matrix[i-1][j+1]));
            }
        }
        int a = Math.min(ans,matrix[0][0]);
        return a;
    }
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int n:nums){
            hs.put(n,hs.getOrDefault(n,0)+1);
        }
        return nums;
    }
    public static int mostWordsFound(String[] sentences) {
        int max = 0;
        for(int i =0;i<sentences.length;i++){
            max = Math.max(max,sentences[i].split("//s").length);
        }
        return max;
    }

}
