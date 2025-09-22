// Task 03: Row Rotation Policy of BRACU Classroom
class Task3{
    public static Integer rowRotation( Integer examWeek, String[][] matrix ) {
//        String[][] newArr = new String[matrix.length][matrix[0].length];
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                newArr[i][j] = matrix[i][j];
//            }
//        }
//        int row = 0;
//        for (int i = 0; i < matrix[0].length; i++) {
//            int c = examWeek - 1;
//            for (int j = 0; j < matrix.length; j++) {
//                if (c < matrix.length) {
//                    newArr[c][i] = matrix[j][i];
//                    if (newArr[c][i].equals("AA")) {
//                        row = c + 1;
//                    }
//                    c++;
//                } else {
//                    newArr[c % matrix.length][i] = matrix[j][i];
//                    if (newArr[c % matrix.length][i].equals("AA")) {
//                        row = c % matrix.length + 1;
//                    }
//                    c++;
//                }
//
//            }
//        }
//        Arr.print2D(newArr);
//        return row;
        int week  = examWeek - 1,n=0;
        String[] temp;
        while(n<week){
            temp = matrix[matrix.length-1];
            for(int i = matrix.length-1; i>0; i--){
                matrix[i] = matrix[i-1];
            }
            matrix[0] = temp;
            n++;
        }
        Arr.print2D(matrix);
        int row = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j].equals("AA")){
                    row = i;
                }
            }
        }
        return row+1;
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        String[][] seatStatus = {
                {"A" , "B"  , "C"  , "D"  , "E"},
                {"F" , "G"  , "H"  , "I"  , "J"},
                {"K" , "L"  , "M"  , "N"  , "O"},
                {"P" , "Q"  , "R"  , "S"  , "T"},
                {"U" , "V"  , "W"  , "X"  , "Y"},
                {"Z" , "AA" , "BB" , "CC" , "DD"}
        };
        System.out.println("Given Seat Status: ");
        Arr.print2D(seatStatus);
        
        System.out.println("\nExpected Output:");
        System.out.println("| U  | V  | W  | X  | Y  | ");
        System.out.println("| Z  | AA | BB | CC | DD | ");
        System.out.println("| A  | B  | C  | D  | E  | ");
        System.out.println("| F  | G  | H  | I  | J  | ");
        System.out.println("| K  | L  | M  | N  | O  | ");
        System.out.println("| P  | Q  | R  | S  | T  | ");
        System.out.println("Your friend AA will be on row 2");
        
        System.out.print("\nYour Output:\n");
        Integer examWeek = 3;
        //This following should print modified seat status after rotation and return the current exam week
        Integer rowNumber = rowRotation( examWeek, seatStatus );
        //The following should print Your friend AA will be on row 2
        System.out.println("Your friend AA will be on row "+rowNumber);
    }
}