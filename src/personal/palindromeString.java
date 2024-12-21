package personal;

import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(isPalindrfome(str)){
            System.out.println("Yes");
        } else  {
            System.out.println("No");
        }
    }
    public static boolean isPalindrfome(String str){
        int i = 0;
        int j = str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
