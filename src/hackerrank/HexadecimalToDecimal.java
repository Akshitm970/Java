package hackerrank;

import java.util.Scanner;

public class HexadecimalToDecimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(toDecimal(a, 15));
    }
    private static String toDecimal(String hex, int numberDigits) {
        int index = hex.indexOf('.');
        assert index != -1;
        StringBuilder decimal = new StringBuilder((index == 0) ? "" : String.valueOf(Integer.parseInt(hex.substring(0, index), 16)));
        decimal.append('.');
        int l = hex.length() - index - 1;
        assert l >= 1;
        int firstIndex = index + 1;
        int hexDigits[] = new int[l];
        for (int i = 0; i < l; i++) {
            hexDigits[i] = Integer.parseInt(hex.substring(i + firstIndex, i + firstIndex + 1), 16);
        }
        while (numberDigits != 0 && l != 0) {
            int carry = 0;
            boolean allZeroes = true;
            for (int i = l - 1; i >= 0; i--) {
                int value = hexDigits[i] * 10 + carry;
                if (value == 0 && allZeroes) {
                    l = i;
                }
                else {
                    allZeroes = false;
                    carry = (int)(value / 16);
                    hexDigits[i] = value % 16;
                }
            }
            numberDigits--;
            if (carry != 0 || (numberDigits != 0 && l != 0))
                decimal.append("0123456789".charAt(carry));
        }
        return decimal.toString();
    }
}
