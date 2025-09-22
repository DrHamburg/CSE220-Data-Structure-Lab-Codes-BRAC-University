public class task5 {
    private int vertices;
    private edge[] adj_list;
    task5(int vertices){
        this.vertices = vertices+1;
        this.adj_list = new edge[this.vertices];
    }
    public void addedges(int[][] edges){
        for(int i=0; i< edges.length;i++){
            int[] edge = edges[i];
            int u= edge[0];
            int v= edge[1];
            edge newEdge = new edge(u,v);
            if(adj_list[u] == null){
                adj_list[u]=newEdge;
            }else{
                edge head = adj_list[u];
                newEdge.next = head;
                adj_list[u] = newEdge;
            }
            edge newEdge2 = new edge(v,u);
            if(adj_list[v] == null){
                adj_list[v]=newEdge2;
            }else{
                edge head = adj_list[v];
                newEdge2.next = head;
                adj_list[v] = newEdge2;
            }
        }
    }
    public void printList() {
        System.out.println("Adjacency List:");
        for (int i = 1; i < vertices; i++) {
            System.out.print(i + ": ");
            edge current = adj_list[i];
            while (current != null) {
                System.out.print(current.destination + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
    public int maxDegree(){
        int sum =0,vertex=1;
        for(int i=1;i<adj_list.length;i++){
            edge current = adj_list[i];
            int tempsum=0;
            while(current!=null){
                tempsum++;
                current = current.next;
            }
            if(sum<tempsum){
                sum=tempsum;
                vertex=i;
            }
        }
        System.out.printf("Max Degree Vertex: %d\n",vertex);
        return sum;
    }
}
