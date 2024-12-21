package personal;
import java.util.*;

public class Solution {

    public long minDamage(int power, int[] damage, int[] health) {
        int n = damage.length;

        // Create a list of enemies where each enemy is represented as an object with damage and health
        Enemy[] enemies = new Enemy[n];
        for (int i = 0; i < n; i++) {
            enemies[i] = new Enemy(damage[i], health[i]);
        }

        // Sort enemies based on their damage per second in descending order
        Arrays.sort(enemies, (a, b) -> b.damage - a.damage);

        long totalDamage = 0;
        long timeElapsed = 0;

        // Attack the enemies in sorted order
        for (Enemy enemy : enemies) {
            // Calculate the number of seconds Bob will take to kill this enemy
            long timeToKill = (enemy.health + power - 1) / power;  // ceiling of health / power

            // Bob will take damage from this enemy during these seconds
            totalDamage += enemy.damage * (timeElapsed + timeToKill);

            // Update the time elapsed after killing this enemy
            timeElapsed += timeToKill;
        }

        return totalDamage;
    }

    // Class to represent an enemy with damage and health
    class Enemy {
        int damage;
        int health;

        Enemy(int damage, int health) {
            this.damage = damage;
            this.health = health;
        }
    }

    // Main method to test the solution
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test Case 1
        int power1 = 4;
        int[] damage1 = {1, 2, 3, 4};
        int[] health1 = {4, 5, 6, 8};
        System.out.println(solution.minDamage(power1, damage1, health1));  // Output: 39

        // Test Case 2
        int power2 = 1;
        int[] damage2 = {1, 1, 1, 1};
        int[] health2 = {1, 2, 3, 4};
        System.out.println(solution.minDamage(power2, damage2, health2));  // Output: 20

        // Test Case 3
        int power3 = 8;
        int[] damage3 = {40};
        int[] health3 = {59};
        System.out.println(solution.minDamage(power3, damage3, health3));  // Output: 320
    }
}