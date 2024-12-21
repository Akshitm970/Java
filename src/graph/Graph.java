package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph<T> {
    public static void main(String[] args) {
        Graph<Integer> graph = new Graph<>();
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.printGraph();
    }
    private Map<T, List<T>> adjList;
    public Graph(){
        adjList = new HashMap<>();
    }
    public void addVertex(T vertex){
        adjList.put(vertex, new ArrayList<>());
    }
    public void addEdge(T source, T destination){
        adjList.get(source).add(destination);
        adjList.get(destination).add(source);
    }
    public List<T> getNeighbors(T vertex){
        return adjList.get(vertex);
    }
    public void printGraph(){
        for(T vertex : adjList.keySet()){
            System.out.print(vertex+"->");
            for(T neighbor : adjList.get(vertex)){
                System.out.print(neighbor+" ");
            }
            System.out.println();
        }
    }


}
