package personal;
import java.util.*;
public class DesertQueen {
    static class co {
        int row, col;
        co(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
    static class Node implements Comparable<Node> {
        int c;
        co co;

        Node(int c, co co) {
            this.c = c;
            this.co = co;
        }

        public int compareTo(Node other) {
            return Integer.compare(this.c, other.c);
        }
    }
    static final co[] m = {new co(-1, 0), new co(1, 0), new co(0, -1), new co(0, 1)};
    static boolean isAccessible(int row, int col, int size, char[][] map) {
        return row >= 0 && col >= 0 && row < size && col < size && map[row][col] != 'M';
    }
    static int calculateWaterUsage(int size, char[][] map, co s, co destination) {
        PriorityQueue<Node> priorityQueue = new PriorityQueue<>();
        int[][] c = new int[size][size];
        for (int[] row : c) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        priorityQueue.add(new Node(0, s));
        c[s.row][s.col] = 0;

        while (!priorityQueue.isEmpty()) {
            Node currentNode = priorityQueue.poll();
            int cc = currentNode.c;
            co currentCoord = currentNode.co;

            int row = currentCoord.row, col = currentCoord.col;
            if (currentCoord.row == destination.row && currentCoord.col == destination.col) {
                return cc;
            }
            for (co move : m) {
                int newRow = row + move.row, newCol = col + move.col;
                if (isAccessible(newRow, newCol, size, map)) {
                    int tc = cc + (map[row][col] == 'T' && map[newRow][newCol] == 'T' ? 0 : 1);
                    if (tc < c[newRow][newCol]) {
                        c[newRow][newCol] = tc;
                        priorityQueue.add(new Node(tc, new co(newRow, newCol)));
                    }
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gs = scanner.nextInt();
        char[][] gm = new char[gs][gs];
        co s = null, d = null;

        for (int i = 0; i < gs; ++i) {
            for (int j = 0; j < gs; ++j) {
                gm[i][j] = scanner.next().charAt(0);
                if (gm[i][j] == 'S') s = new co(i, j);
                if (gm[i][j] == 'E') d = new co(i, j);
            }
        }

        int result = calculateWaterUsage(gs, gm, s, d);
        System.out.println(result);
    }
}

