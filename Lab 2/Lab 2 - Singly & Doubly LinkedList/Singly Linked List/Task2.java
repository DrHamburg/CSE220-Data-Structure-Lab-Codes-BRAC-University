// Task04: Word Decoder
public class Task2 {
    public static Node wordDecoder( Node head ){
        Node current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        current = head;
        int elem = 0;
        while (current != null) {
            if(elem == 13%count){
                head = current;
                break;
            }
            elem++;
            current = current.next;
        }
        int multi = 13%count;
        Node temp= head;
        Node newNode = head;
        int c = 3;
        for (int i = multi+1; i <= count ; i++) {
            if( i% multi==0){
                while(c!=i){
                    temp = temp.next;
                    c++;
                }
                newNode.next = temp;
                newNode = temp;
            }
        }
        Node dHead = new Node(null, null);
        newNode.next = dHead;
        Node prev = null;
        Node next = null;
        current = head;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        dHead = prev;
        return dHead;
    }


    public static void main(String[] args){
        System.out.println("==============Test Case 1=============");
        Node head = LinkedList.createList(new Character[]{'B', 'M', 'D', 'T', 'N', 'O', 'A', 'P', 'S', 'C'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> C -> A -> T");
        Node result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result);
        System.out.println();
        System.out.println("==============Test Case 2=============");
        head = LinkedList.createList(new Character[]{'Z', 'O', 'T', 'N', 'X'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> N");
        result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result);
        System.out.println();
    }
}
