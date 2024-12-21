package AllETechnologies;

import java.util.ArrayList;
import java.util.List;

public class OccurrencesOfRepeatedWordFromASentence {
    public static void main(String[] args) {
        String s = "this is nonsense is not";
        System.out.println(occurrencesOfRepeatedWordFromASentence(s));
    }
    public static int occurrencesOfRepeatedWordFromASentence(String s) {
        int count = 0;
        StringBuilder word = new StringBuilder();
        List<String> words = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                word.append(c);
            } else if (word.length() > 0) {
                words.add(word.toString());
                word.setLength(0);
            }
        }
        if (word.length() > 0) {
            words.add(word.toString());
        }

        for (int i = 0; i < words.size(); i++) {
            for (int j = i + 1; j < words.size(); j++) {
                if (words.get(i).equals(words.get(j))) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
