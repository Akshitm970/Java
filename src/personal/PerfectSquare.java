package personal;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i = 1; i <= n; i++) {
//            arr[i] = sc.nextInt();
//        }
        int[] arr = {16,15,14,25,34};
//        int a = 15;
//        int b = 16;
//        System.out.println(isPerfectSquare(a));
//        System.out.println(isPerfectSquare(b));
        System.out.println(isPerfectSquare2(5,arr));
    }
    public static boolean isPerfectSquare(int num) {
        if(num <= 0){
            return false;
        }
        int m = (int)Math.sqrt(num);
        return m*m == num;
    }
    public static int isPerfectSquare2(int num , int[] a) {
        int count = 0;
        for(int i = 0; i < num; i++) {
            int n = (int)Math.sqrt(a[i]);
            if(a[i] == n*n){
                count++;
            }
        }
        return count;
    }
}
