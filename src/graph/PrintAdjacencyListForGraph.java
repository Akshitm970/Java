package graph;

import java.util.Vector;

public class PrintAdjacencyListForGraph {
    public static void main(String[] args) {
        int v = 3;
        int edges[][] = {{0,1},{1,2},{2,0}};
        int noOfEdges = 3;
        initGraph(v, edges, noOfEdges);
    }
    public static void initGraph(int v,int edges[][],int noOfEdges) {
        Vector<Integer> adj[] = new Vector[3];
        for(int i = 0;i<adj.length;i++){
            adj[i] = new Vector<>();
        }
        for(int i = 0;i<noOfEdges;i++){
            addEdges(adj,edges[i][0],edges[i][1]);
        }
        adjacencylist(adj,v);
    }
    public static void addEdges(Vector<Integer> adj[],int u,int v){
        adj[u].add(v);
    }
    public static void adjacencylist(Vector<Integer> adj[],int v){
        for(int i = 0;i<v;i++){
            System.out.print(i+"->");
            for (int x:adj[i]){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
