public class task8 {
    private int vertices;
    private edgew[] adj_list;
    task8(int vertices){
        this.vertices = vertices+1;
        adj_list = new edgew[this.vertices];
    }
    public void addedges(int[][] edges){
        for(int i=0; i< edges.length;i++){
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
        }
    }
    public void printListDir() {
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

    public void dirToUndir(){
        edgew[] undir = new edgew[vertices];
        for(int i=1; i< adj_list.length;i++){
            edgew current =adj_list[i];
            while(current!=null){
                edgew newEdge1 = new edgew(current.source, current.destination, current.weight);
                if(undir[i] == null){
                    undir[i] = newEdge1;
                }else{
                    newEdge1.next = undir[i];
                    undir[i] = newEdge1;
                }
                int n = current.destination;
                edgew newEdge2 = new edgew(current.destination, current.source, current.weight);
                if(undir[n] == null){
                    undir[n] = newEdge2;
                }else{
                    newEdge2.next = undir[n];
                    undir[n] = newEdge2;
                }
                current = current.next;
            }

        }
        System.out.println("Undirected ADJ List");
        for (int i = 1; i < vertices; i++) {
            System.out.print(i + ": ");
            edgew current = undir[i];
            while (current != null) {
                System.out.print("("+current.destination +","+ current.weight+")" +" ");
                current = current.next;
            }
            System.out.println();
        }
    }
}
