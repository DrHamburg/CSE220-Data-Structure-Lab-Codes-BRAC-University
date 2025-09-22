public class Task5 {
    public static int sumDist(Node head, Integer[] distArr) {
        Node current = head;
        int sum = 0;
        for(int i=0; i<distArr.length;i++){
            int index = 0;
            while(current != null) {
                if(distArr[i] == index){
                    sum+= (int)current.elem;
                    current = current.next;
                    break;
                }
                index++;
                current = current.next;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("=========Test Case 1=============");
        Node head1 = LinkedList.createList(new Integer[]{10, 16, -5, 9, 3, 4});
        Integer[] dist = new Integer[] {2, 0, 5, 2, 8};
	System.out.print("Given LinkedList: ");
	LinkedList.printLL(head1);
	System.out.print("Distance Array: ");
	Arr.print(dist);
        System.out.println("\nExpected Output: 4");
	int returnedValue = Task5.sumDist(head1, dist);
	System.out.println("Your Output: "+returnedValue); // This should print: Sum of Nodes: 4
    }
}
