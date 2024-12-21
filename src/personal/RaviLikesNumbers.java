package personal;
import java.util.Scanner;

public class RaviLikesNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();  // consume the newline

        for (int i = 0; i < N; i++) {
            String number = sc.nextLine();
            System.out.println(getLargestNonDecreasingNumber(number));
        }

        sc.close();
    }

    private static String getLargestNonDecreasingNumber(String number) {
        char[] digits = number.toCharArray();
        int n = digits.length;
        int i = 1;
        while (i < n && digits[i] >= digits[i - 1]) {
            i++;
        }
        if (i == n) {
            return number;
        }

        // Decrease the digit where the first decrease occurs
        while (i > 0 && digits[i - 1] > digits[i]) {
            digits[i - 1]--;
            i--;
        }

        // Set all digits after i to '9' to get the largest possible number
        for (int j = i + 1; j < n; j++) {
            digits[j] = '9';
        }
        String result = new String(digits);
        result = result.replaceFirst("^0+(?!$)", "");

        return result;

    }
}
