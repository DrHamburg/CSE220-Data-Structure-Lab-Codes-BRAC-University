public class edgew {
    int source;
    int destination;
    int weight;
    edgew next;
    edgew(int source, int destination, int weight){
        this.source = source;
        this.destination = destination;
        this.weight = weight;
        this.next = null;
    }
}
