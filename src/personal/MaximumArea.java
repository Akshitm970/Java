package personal;
import java.util.*;

public class MaximumArea {
    static class LineSegment {
        int x1, y1, x2, y2;

        LineSegment(int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of line segments
        int n = sc.nextInt();

        // Input line segments
        List<LineSegment> lineSegments = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            lineSegments.add(new LineSegment(x1, y1, x2, y2));
        }

        // Generate all polygons formed
        List<List<int[]>> polygons = getPolygons(lineSegments);

        // Find the maximum area among the polygons
        int maxArea = 0;
        for (List<int[]> polygon : polygons) {
            maxArea = Math.max(maxArea, calculatePolygonArea(polygon));
        }

        // Output the maximum area
        System.out.println(maxArea);
    }

    // Function to find all closed polygons formed by the line segments
    private static List<List<int[]>> getPolygons(List<LineSegment> lineSegments) {
        List<List<int[]>> polygons = new ArrayList<>();
        Set<String> visitedEdges = new HashSet<>();

        for (LineSegment segment : lineSegments) {
            String edge1 = segment.x1 + "," + segment.y1 + "->" + segment.x2 + "," + segment.y2;
            String edge2 = segment.x2 + "," + segment.y2 + "->" + segment.x1 + "," + segment.y1;

            if (visitedEdges.contains(edge1) || visitedEdges.contains(edge2)) continue;

            // Start exploring a polygon
            List<int[]> polygon = new ArrayList<>();
            explorePolygon(segment.x1, segment.y1, segment.x2, segment.y2, lineSegments, polygon, visitedEdges);

            if (polygon.size() > 2) { // Valid polygon must have at least 3 sides
                polygons.add(polygon);
            }
        }

        return polygons;
    }

    // Recursive DFS to explore polygons
    private static void explorePolygon(int x1, int y1, int x2, int y2, List<LineSegment> lineSegments, List<int[]> polygon, Set<String> visitedEdges) {
        String currentEdge = x1 + "," + y1 + "->" + x2 + "," + y2;
        String reverseEdge = x2 + "," + y2 + "->" + x1 + "," + y1;

        if (visitedEdges.contains(currentEdge)) return;

        visitedEdges.add(currentEdge);
        polygon.add(new int[]{x1, y1});

        for (LineSegment segment : lineSegments) {
            if (segment.x1 == x2 && segment.y1 == y2 && !visitedEdges.contains(segment.x1 + "," + segment.y1 + "->" + segment.x2 + "," + segment.y2)) {
                explorePolygon(segment.x1, segment.y1, segment.x2, segment.y2, lineSegments, polygon, visitedEdges);
                return;
            } else if (segment.x2 == x2 && segment.y2 == y2 && !visitedEdges.contains(segment.x2 + "," + segment.y2 + "->" + segment.x1 + "," + segment.y1)) {
                explorePolygon(segment.x2, segment.y2, segment.x1, segment.y1, lineSegments, polygon, visitedEdges);
                return;
            }
        }
    }

    // Function to calculate the area of a polygon using Shoelace formula
    private static int calculatePolygonArea(List<int[]> polygon) {
        int n = polygon.size();
        int area = 0;

        for (int i = 0; i < n; i++) {
            int[] current = polygon.get(i);
            int[] next = polygon.get((i + 1) % n);

            area += current[0] * next[1] - current[1] * next[0];
        }

        return Math.abs(area) / 2;
    }
}
