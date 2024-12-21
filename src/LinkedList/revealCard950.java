package LinkedList;

import java.util.*;

public class revealCard950 {
    public static void main(String[] args) {
        int a = maximizeSum(new int[]{2, 3, 4}, 2);
        System.out.println(a);
    }
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int[] arr = new int[deck.length];
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < deck.length; i++) {
            q.add(i);
        }
        for (int card : deck) {
            int idx = q.poll();
            arr[idx] = card;
            if (!q.isEmpty()) {
                q.add(q.poll());
            }
        }
        return arr;
    }
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> l = new LinkedList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                l.add(i);
            }
        }
        return l;
    }
    public static int maximizeSum(int[] nums, int k) {
        int sum = 0;
        int max = 0;
        max = Arrays.stream(nums).max().getAsInt();
        // sum += max;
        while(k>0){
            max++;
            k--;
            sum += max;
        }
        return sum;
    }
}
