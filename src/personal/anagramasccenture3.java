package personal;

import java.util.Arrays;

public class anagramasccenture3 {
    public static void main(String[] args) {
        String s1 = "Listen";
        String s2 = "Silent";

//        s1 = s1.toLowerCase();
//        s2 = s2.toLowerCase();
//
//        char[] c = s1.toCharArray();
//        char[] c2 = s2.toCharArray();
//        Arrays.sort(c);
//        Arrays.sort(c2);
//        if(Arrays.equals(c, c2)){
//            System.out.println("Anagram");
//        }else
//            System.out.println("Not Anagram");
        int power = 4;
        int damage[] = {1, 2, 3, 4};
        int health[] = {4, 5, 6, 8};
        System.out.println(minDamage(power,damage,health));
    }
//    class Solution {
        public static long minDamage(int power, int[] damage, int[] health) {
            int n = damage.length;

            // Create an array of enemies, where each enemy is represented as an object with damage and health
            Enemy[] enemies = new Enemy[n];

            for (int i = 0; i < n; i++) {
                enemies[i] = new Enemy(damage[i], health[i]);
            }

            // Sort enemies based on their damage per second in descending order
            Arrays.sort(enemies, (a, b) -> b.damage - a.damage);

            long totalDamage = 0;
            long timeElapsed = 0;

            // Attack the enemies in the sorted order
            for (Enemy enemy : enemies) {
                // Total damage Bob takes while this enemy is alive
                totalDamage += enemy.damage * enemy.health;
                // Bob attacks the enemy for 'enemy.health / power' seconds, until it's dead
                timeElapsed += (enemy.health + power - 1) / power; // ceiling of health/power
            }

            return totalDamage;
        }

        // Class to represent an enemy with damage and health
        static class Enemy {
            int damage;
            int health;

            Enemy(int damage, int health) {
                this.damage = damage;
                this.health = health;
            }
        }
    }
//}
