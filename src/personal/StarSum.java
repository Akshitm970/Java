package personal;

import java.util.Scanner;

public class StarSum {
    public static int calculateStarSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num;
            num /= 10;
        }
        return sum;
    }

    public static int countValuesWithStarSumGreaterThanN(int N) {
        int count = 0;

//        for (int i = 1; i <= N; i++) {
//            int starSum = calculateStarSum(i);
//            if (starSum > N) {
//                count++;
//            }
//        }

        for(int i = N; N>0; N--) {
            int starSum = calculateStarSum(i);
            if (starSum > N) {
                count++;
            }else
                break;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
//        int N = scanner.nextInt();

        int N = 111;
        int result = countValuesWithStarSumGreaterThanN(N);
        System.out.println("Output: " + result);
    }
}
