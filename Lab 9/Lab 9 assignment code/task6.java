public class task6 {
    private int vertices;
    private edgew[] adj_list;
    task6(int vertices){
        this.vertices = vertices+1;
        adj_list = new edgew[this.vertices];
    }
    public void addedges(int[][] edges){
        for (int i = 0; i < edges.length; i++) {
            int[] edge = edges[i];
            int u= edge[0];
            int v= edge[1];
            int w= edge[2];
            edgew newEdge = new edgew(u,v,w);
            if(adj_list[u] == null){
                adj_list[u]=newEdge;
            }else{
                edgew head = adj_list[u];
                newEdge.next = head;
                adj_list[u] = newEdge;
            }
            edgew newEdge2 = new edgew(v,u,w);
            if(adj_list[v] == null){
                adj_list[v]=newEdge2;
            }else{
                edgew head = adj_list[v];
                newEdge2.next = head;
                adj_list[v] = newEdge2;
            }
        }
    }
    public void printList() {
        System.out.println("Adjacency List:");
        for (int i = 1; i < vertices; i++) {
            System.out.print(i + ": ");
            edgew current = adj_list[i];
            while (current != null) {
                System.out.print("("+current.destination +","+ current.weight+")" +" ");
                current = current.next;
            }
            System.out.println();
        }
    }
    public void maxweightVertex(){
        int sum =0,vertex=1;
        for(int i=1;i<adj_list.length;i++){
            edgew current = adj_list[i];
            int tempsum=0;
            while(current!=null){
                tempsum+=current.weight;
                current = current.next;
            }
            if(sum<tempsum){
                sum=tempsum;
                vertex=i;
            }
        }
        System.out.printf("Max Weight Vertex: %d\n",vertex);

    }
}
