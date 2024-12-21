package graph;

public class graph1 {
    public static void main(String[] args) {
        int edges[][]= {{0,2},{0,1},{1,3}};
        int nodes = 4;
        graph1 graph = new graph1(nodes);
        graph.addEdgesInMatrix(edges,false);
        graph.printMatrix();
    }
    graph1(int nodes){
        adjMatrix = new int[nodes][nodes];
    }
    int adjMatrix[][];

    public void printMatrix(){
        for(int i=0;i<adjMatrix.length;i++){
            System.out.print("row--> "+i+" --> ");
            for(int j=0;j<adjMatrix[i].length;j++){
                System.out.print(adjMatrix[i][j]+",");
            }
            System.out.println();
        }
    }
    public void addEdgesInMatrix(int edges[][],boolean isDirected){
        for (int edge[] :edges){
            int u = edge[0];
            int v = edge[1];

            if(isDirected){
                adjMatrix[u][v] = 1;
            }else {
                adjMatrix[v][u] = 1;
                adjMatrix[u][v] = 1;
            }
        }
    }
}
