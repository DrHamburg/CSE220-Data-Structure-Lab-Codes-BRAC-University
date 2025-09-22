public class task3 {
    int vertices;
    int[][] adj_mat;
    task3(int vertices){
        this.vertices = vertices+1;
        adj_mat = new int[this.vertices][this.vertices];
    }
    public void addedges(int[][] edges){
        for(int i=1; i< edges.length;i++){
            int[] edge = edges[i];
            int u= edge[0];
            int v= edge[1];
            int w= edge[2];
            adj_mat[u][v] = w;
        }
    }
    public int maxDegree(){
        int sum=0;
        int vertex=1;
        for(int i=1; i< adj_mat.length;i++){
            int tempsum=0;
            for (int j = 1; j < adj_mat.length; j++) {
                if(adj_mat[i][j]>0){
                    tempsum++;
                }
            }
            if(sum<tempsum){
                sum=tempsum;
                vertex = i;
            }
        }
        System.out.printf("vertex: %d\n",vertex);
        return sum;
    }
    public int maxWeightEdge(){
        int sum=0;
        int vertex=0;
        for(int i=0; i<adj_mat.length;i++){
            int tempsum=0;
            for (int j = 0; j < adj_mat.length; j++) {
                tempsum+=adj_mat[i][j];
            }
            if(tempsum>sum){
                sum = tempsum;
                vertex = i;
            }
        }
        return vertex;
    }
}
