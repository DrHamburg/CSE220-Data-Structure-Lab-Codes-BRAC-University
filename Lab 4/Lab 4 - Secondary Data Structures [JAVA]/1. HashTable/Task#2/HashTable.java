/*You will have to complete the FruitNode Constructor first
 then within this class you only have to complete two methods
 hashFunction() and insert()
 the rest of the methods are already written
 DO NOT TOUCH any other methods or codes*/
public class HashTable {

    //ht[] :: is the HashTable array that stores the FruitNode objects
    private FruitNode[] ht;

    //Constructor that initializes the HashTable array
	//DO NOT change this Constructor
    public HashTable(int size){
        this.ht = new FruitNode[size];
    }

    //This method basically prints the HashTable
    //DO NOT change this method
    public void show(){
        for(int i=0; i<ht.length; i++){
            System.out.print( i+" " );
            FruitNode n = ht[i];
            while (n!=null){
                System.out.print("('"+n.fruit[0]+"', "+n.fruit[1]+") --> ");
                n = n.next;
            }
            System.out.println();
        }
    }


    private int hashFunction( String key ){
        int sum=0;
        if(key.length()%2==0){
            for (int i = 0; i < key.length(); i+=2) {
                sum+=key.charAt(i); //sum= sum + key.charAt(i);
            }
        }else{
            for (int i = 1; i < key.length(); i+=2) {
                sum+=key.charAt(i);
            }
        }
        return sum% ht.length;
    }

    public void insert(String key, Integer value){
        int hashedIndex = this.hashFunction( key );
        FruitNode newFNode = new FruitNode( key, value );
        if ( this.ht[hashedIndex] == null ){
            this.ht[hashedIndex] = newFNode;
        } else {
            FruitNode current = ht[hashedIndex];
            if((int)newFNode.fruit[1]>= (int)current.fruit[1] && newFNode.fruit[0].equals(current.fruit[0])) {
                this.ht[hashedIndex] = newFNode;
            }
            else{
                while(current.next!=null && (int)current.next.fruit[1]>= (int) newFNode.fruit[1]  ) {
                    current = current.next;
                }
                if((int)newFNode.fruit[1]>= (int)current.fruit[1] && newFNode.fruit[0].equals(current.fruit[0])) {
                    this.ht[hashedIndex] = newFNode;
                }
                newFNode.next = current.next;
                current.next = newFNode;
            }
        }
    }
}
