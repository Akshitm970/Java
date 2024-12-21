package wipro;

import java.util.Scanner;
import java.util.Stack;

public class LongestSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String m = sc.nextLine();
        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < m.length(); i++) {

            for(int j = i+1; j < m.length(); j++) {
                if (count >= 0) {
                    if (m.charAt(j) == '(') {
                        count++;
                    } else {
                        count--;
                    }
                } else {
                    max = Math.max(max, Math.abs(j - i));
                }
            }
        }
        System.out.println(max+2);
    }
}
