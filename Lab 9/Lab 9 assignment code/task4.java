public class task4 {
    int vertices;
    int[][] adj_mat;
    public task4(int vertices){
        this.vertices= vertices+1;
        adj_mat = new int[this.vertices][this.vertices];
    }
    public void addedges(int[][] edges){
        for (int i = 0; i < edges.length; i++) {
            int[] edge= edges[i];
                int u = edge[0];
                int v = edge[1];
                int w = edge[2];
                adj_mat[u][v] = w;
        }
    }

    public void undirected(){
        for (int i = 1; i < adj_mat.length; i++) {
            for (int j = 1; j < adj_mat.length; j++) {
                adj_mat[j][i] = adj_mat[i][j];
            }
        }
    }
    public void printadj_mat(){
        for (int i = 1; i < adj_mat.length; i++) {
            for (int j = 1; j < adj_mat.length; j++) {
                System.out.printf("%d %d-> %d\n",i,j,adj_mat[i][j]);
            }
        }
    }
}
