package personal;

import java.util.Scanner;

public class countInversion {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Input: Number of elements
    int n = scanner.nextInt();

    // Input: Elements of the array
    int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
        arr[i] = scanner.nextInt();
    }

    // Output: Total number of inversions
        System.out.println(mergeSortAndCount(arr, 0, n - 1));

        scanner.close();
    }
    public static long mergeSortAndCount(int[] arr,int left,int right){
        return 0;
    }
}