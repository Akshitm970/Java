package strings;

import java.util.ArrayList;

public class maxVowels {
    public static int maxVowels(String s, int k) {
        String st = "";
        int countmax = 0;
        for(int i =0;i<s.length();i++){
            for(int j = 0;j<k;j++){
                st = st + s.charAt(i);
                // int max = count(st);
            }
            countmax = Integer.max(countmax,count(st));
            st = "";
        }
        return countmax;
    }
    public static int count(String s){
        int num = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' ){
                num++;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(maxVowels("abciiidef",3));
//        int[] arr = new int[3];
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.size();
//        list1.get();
        list1.remove(3);
//        list1.d
    }
}
