package graph;

import java.util.ArrayList;
import java.util.Arrays;

public class BelmanFoldAlgorithm {
    public static void main(String[] args) {
//        System.out.println(1e8);
//        double positiveInfinity = Double.POSITIVE_INFINITY;
//        double negativeInfinity = Double.NEGATIVE_INFINITY;
//
//        System.out.println(positiveInfinity); // Output: Infinity
//        System.out.println(negativeInfinity); // Output: -Infinity
//        if(1<positiveInfinity) {
//            System.out.println("1");
//        }
//        System.out.println();
////        Math.TAU

        System.out.println(Integer.MAX_VALUE); //2147483647

    }

    static int[] bellman_ford(int V, ArrayList<ArrayList<Integer>> edges, int S) {
        int[] dist = new int[V];
        Arrays.fill(dist, (int)1e8);
        dist[S] = 0;
        for(int i = 0;i<V-1;i++) {
        boolean isChanged = false;
            for (ArrayList<Integer> edge: edges){
                int u = edge.get(0);
                int v = edge.get(1);
                int w = edge.get(2);
                if (dist[u] != (int)1e8 && dist[v] + w<dist[v]) {
                    dist[v] = dist[u] + w;
                    isChanged = true;
                }
            }
            if(!isChanged) {
                break;
            }

        }
            for (ArrayList<Integer> edge: edges){
                int u = edge.get(0);
                int v = edge.get(1);
                int w = edge.get(2);
                if (dist[u] != (int)1e8 && dist[v] + w<dist[v]) {
                    return new int[]{-1};
//                    dist[v] = dist[u] + w;
                }
            }
        return dist;
    }
}