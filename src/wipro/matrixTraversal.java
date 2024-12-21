package wipro;

import java.util.Scanner;

public class matrixTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        spiral (arr, arr.length, arr[0].length);
    }
    public static void spiral (int arr[][], int row, int col)
    {
        int i, k = 0, l = 0;

        while (k < row && l < col)
        {
            for (i = l; i < col; ++i)
                System.out.print (arr[k][i] + " ");
            k++;
            for (i = k; i < row; ++i)
                System.out.print (arr[i][col - 1] + " ");
            col--;

            if (k < row)
            {
                for (i = col - 1; i >= l; --i)
                    System.out.print (arr[row - 1][i] + " ");
                row--;
            }

            if (l < col)
            {
                for (i = row - 1; i >= k; --i)
                    System.out.print (arr[i][l] + " ");
                l++;
            }
        }
    }
}
