package wipro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] arr = new int[a][b];
        for(int i = 0;i<a;i++){
            for(int j = 0;i<b;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int[][] arr1 = new int[b][a];
        for(int j = 0;j<b;j++){
            for(int i = 0;i<a;i++){
                arr1[j][i] = arr[i][j];
            }
        }
        for(int j = 0;j<b;j++){
            for(int i = 0;i<a;i++){
                System.out.println(arr1[j][i]);
            }
        }
    }
}
