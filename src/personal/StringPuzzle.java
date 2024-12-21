package personal;

import java.util.*;

public class StringPuzzle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of edges
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        // Graph representation
        Map<String, List<String>> graph = new HashMap<>();
        Map<String, Integer> inDegree = new HashMap<>();

        // Read edges
        for (int i = 0; i < n; i++) {
            String[] edge = sc.nextLine().split(" ");
            String from = edge[0], to = edge[1];

            graph.putIfAbsent(from, new ArrayList<>());
            graph.get(from).add(to);

            inDegree.put(to, inDegree.getOrDefault(to, 0) + 1);
            inDegree.putIfAbsent(from, 0);
        }

        // Find the root (node with no incoming edges)
        String root = null;
        for (String node : inDegree.keySet()) {
            if (inDegree.get(node) == 0) {
                root = node;
                break;
            }
        }

        // If no root is found, return -1 (invalid tree structure)
        if (root == null) {
            System.out.println(-1);
            return;
        }

        // Perform BFS to calculate levels
        Map<String, Integer> levels = new HashMap<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(root);
        levels.put(root, 1);

        while (!queue.isEmpty()) {
            String current = queue.poll();
            int currentLevel = levels.get(current);

            if (graph.containsKey(current)) {
                for (String neighbor : graph.get(current)) {
                    if (!levels.containsKey(neighbor)) {
                        levels.put(neighbor, currentLevel + 1);
                        queue.add(neighbor);
                    }
                }
            }
        }

        // Read the input string
        String[] inputWords = sc.nextLine().split(" ");

        // Calculate the value of the string
        int totalValue = 0;
        for (String word : inputWords) {
            totalValue += levels.getOrDefault(word, -1);
        }

        // Output the result
        System.out.println(totalValue);
    }
}

