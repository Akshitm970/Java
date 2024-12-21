package leetCode;

import java.util.Arrays;

public class ValidAnagram242 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "anagram";
        System.out.println(isAnagram(s,t));
    }
    public static boolean isAnagram(String s, String t) {
        char[] c = s.toCharArray();
        char[] d = t.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        if(c.length!=d.length){
            return false;
        }
        for(int i = 0;i<d.length;i++){
            if(c[i] != d[i]){
                return false;
            }
        }
        return true;
    }
}
