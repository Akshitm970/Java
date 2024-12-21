package personal;
import java.util.*;
public class LandAllocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        sc.nextLine(); // consume the remaining newline

        char[][] grid = new char[R][C];

        // Read the input grid
        for (int i = 0; i < R; i++) {
            grid[i] = sc.nextLine().toCharArray();
        }

        // Fill horizontally
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (grid[i][j] == '?') {
                    if (j > 0 && grid[i][j - 1] != '?') {
                        grid[i][j] = grid[i][j - 1];
                    }
                }
            }
            for (int j = C - 1; j >= 0; j--) {
                if (grid[i][j] == '?') {
                    if (j < C - 1 && grid[i][j + 1] != '?') {
                        grid[i][j] = grid[i][j + 1];
                    }
                }
            }
        }

        // Fill vertically
        for (int j = 0; j < C; j++) {
            for (int i = 0; i < R; i++) {
                if (grid[i][j] == '?') {
                    if (i > 0 && grid[i - 1][j] != '?') {
                        grid[i][j] = grid[i - 1][j];
                    }
                }
            }
            for (int i = R - 1; i >= 0; i--) {
                if (grid[i][j] == '?') {
                    if (i < R - 1 && grid[i + 1][j] != '?') {
                        grid[i][j] = grid[i + 1][j];
                    }
                }
            }
        }

        // Output the filled grid
        for (int i = 0; i < R; i++) {
            System.out.println(grid[i]);
        }

        sc.close();
    }
}

