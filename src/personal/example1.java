package personal;

import java.util.*;
import java.util.Arrays;
import java.util.Set;

public class example1 {
    public static void main(String[] args) {
        countVowelsAndConsonants("akshit");
        System.out.println(Math.min(1,2));
    }
    boolean twoSum(int arr[], int target) {
        // code here
        Set<Double> complements = new HashSet<>();
        for(double num: arr){
            complements.add(num);
        }
        for (double num : arr) {
            if (complements.contains(target - num)) {
                return true;
            }

        }
        return false;
    }

    public static void countVowelsAndConsonants(String str) {
        int vowels = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) >= 0) {
                vowels++;
            }
        }
        int consonants = str.length() - vowels;
        System.out.println("Vowels: " + vowels);


    }
}
