package AllETechnologies;

import java.util.Scanner;

public class secondLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = secondLargest(arr,n);
        System.out.println(m);
    }
    public static int secondLargest(int arr[], int size) {
        if (size < 2) {
            return -1;
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }

        if (second == Integer.MIN_VALUE) {
            return -1;
        }

        return second;
    }

}
