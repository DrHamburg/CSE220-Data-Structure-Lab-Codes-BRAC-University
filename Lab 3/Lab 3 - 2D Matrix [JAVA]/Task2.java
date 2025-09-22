

//Task 02: Decryption Process
class Task2{


    public static Integer[] decryptMatrix( Integer[][] matrix ){
        Integer[] array = new Integer[matrix[0].length-1];
        Integer sum = 0;
        Integer temp = 0;
        int c=0;
        for(int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                sum+=matrix[j][i];
            }
            if(i!=0){
                temp = sum - temp;
                array[c] = temp;
                c++;
                temp = sum;
            }else{
                temp = sum;

            }
            sum=0;
        }


        return array;

    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] matrix = {
            {1,3,1},
            {6,4,2},
            {5,1,7},
            {9,3,3},
            {8,5,4}
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        System.out.println("\nExpected Output:\n[ -13 1 ]");
        Integer[] returned_val_1 = decryptMatrix( matrix );
        System.out.print("\nYour Output:\n");
        Arr.print(returned_val_1);

    }
}