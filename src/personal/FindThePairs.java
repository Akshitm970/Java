package personal;
import java.util.*;

public class FindThePairs {
    static class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Point point = (Point) obj;
            return x == point.x && y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    static List<Point> normalizeShape(List<Point> vertices) {
        int n = vertices.size();
        List<Point> normalized = new ArrayList<>(vertices);
        int minIndex = 0;

        for (int i = 1; i < n; i++) {
            if (comparePoints(vertices.get(i), vertices.get(minIndex)) < 0) {
                minIndex = i;
            }
        }

        // Rotate the shape to start with the smallest vertex
        for (int i = 0; i < n; i++) {
            normalized.set(i, vertices.get((minIndex + i) % n));
        }

        return normalized;
    }

    static int comparePoints(Point p1, Point p2) {
        if (p1.x != p2.x) {
            return Integer.compare(p1.x, p2.x);
        }
        return Integer.compare(p1.y, p2.y);
    }

    static boolean shapesMatch(List<Point> shape1, List<Point> shape2) {
        return normalizeShape(shape1).equals(normalizeShape(shape2));
    }

    static int[] findMatchingPair(List<List<Point>> shapes) {
        Map<List<Point>, Integer> seen = new HashMap<>();

        for (int i = 0; i < shapes.size(); i++) {
            List<Point> normalized = normalizeShape(shapes.get(i));

            if (seen.containsKey(normalized)) {
                return new int[]{seen.get(normalized) + 1, i + 1}; // 1-based indices
            }

            seen.put(normalized, i);
        }

        return new int[]{-1, -1}; // No matching pair found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt(); // Number of shapes

        List<List<Point>> shapes = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            int K = scanner.nextInt(); // Number of vertices
            List<Point> shape = new ArrayList<>();

            for (int j = 0; j < K; j++) {
                shape.add(new Point(scanner.nextInt(), scanner.nextInt()));
            }
            shapes.add(shape);
        }

        int[] result = findMatchingPair(shapes);

        if (result[0] != -1) {
            System.out.println(result[0] + " " + result[1]);
        } else {
            System.out.println("No matching earrings found.");
        }

        scanner.close();
    }
}
