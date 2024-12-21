package wipro;

import java.util.Scanner;

public class longestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word: ");
        String s = sc.nextLine()+" ";

        String longestWord = "";
        String a = "";
//        int longestWordLength = 0;
        for(int i = 0;i<s.length();i++) {
            if(s.charAt(i)!=' ') {
                longestWord+=s.charAt(i);
            }else{
                if(longestWord.length()>a.length()) {
                    a = longestWord;
                }
                    longestWord = "";
            }
        }
        System.out.println(a);
//        System.out.println(longestWordLength);

    }
}
