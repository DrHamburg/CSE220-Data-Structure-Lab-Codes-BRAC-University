public class task1 {
    private int vertices;
    private int[][] adj_mat;
    task1(int vertices){
        this.vertices = vertices+1;
        adj_mat  = new int[this.vertices][this.vertices];
    }
    public void addedges(int[][] edges){
        for(int i=0; i<edges.length;i++){
            int[] edge = edges[i];
            int u = edge[0];
            int v = edge[1];
            adj_mat[u][v]=1;
            adj_mat[v][u]=1;
        }
    }
    public int countMaxDegree(){
        int sum=0;
        int maxDegreeVertex=0;
        for(int i=0; i< adj_mat.length;i++){
            int tempSum = 0;
            for (int j = 0; j < adj_mat.length; j++) {
                if(adj_mat[i][j]==1){
                    tempSum++;
                }
            }
            if(tempSum>sum){
                sum = tempSum;
                maxDegreeVertex = i;
            }
        }
        System.out.printf("Max degree vertex: %d\n",maxDegreeVertex);
        return sum;
    }
}
