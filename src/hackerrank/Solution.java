package hackerrank;
import java.io.*;
import java.util.*;
import java.util.Arrays;
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];

        int[] arr2 = new int[n];
        for(int i = 0;i<=n;i++){
            arr1[i] = sc.nextInt();
        }
        Arrays.sort(arr1);
        for(int j = 0;j<=n;j++){
            arr2[j] = sc.nextInt();
        }
        Arrays.sort(arr2);
        int sum = 0;
        for(int k = 0;k<=n;k++){
            sum = arr1[k]+arr2[n-k];

        }
        System.out.println(sum);
    }
}