// Task 05: Game Arena
class Task5{
    public static void playGame( Integer[][] arena ){
        int point=0;
        for (int i = 0; i < arena.length; i++) {
            for (int j = 0; j < arena[0].length; j++) {
                if(arena[i][j]!=0 && arena[i][j] % 50==0){
                    if(i==0 && j==0){
                        if(arena[i+1][j]==2){
                            point+=2;
                        }
                        if(arena[i][j+1]==2){
                            point+=2;
                        }
                    }
                    else if(i==arena.length-1 && j==0){
                        if(arena[i+1][j]==2){
                            point+=2;
                        }
                        if(arena[i-1][j]==2){
                            point+=2;
                        }
                        if(arena[i][j+1]==2){
                            point+=2;
                        }
                    }
                    else if(j==arena[0].length-1 && i==0){
                        if(arena[i+1][j]==2){
                            point+=2;
                        }
                        if(arena[i][j-1]==2){
                            point+=2;
                        }
                        if(arena[i][j+1]==2){
                            point+=2;
                        }
                    }
                    else if(i==arena.length-1 && j==arena[0].length-1){
                        if(arena[i-1][j]==2){
                            point+=2;
                        }
                        if(arena[i][j-1]==2){
                            point+=2;
                        }
                    }
                    else if(i!=0 && i!=arena.length-1 && j==0){
                        if(arena[i-1][j]==2){
                            point+=2;
                        }
                        if(arena[i][j+1]==2){
                            point+=2;
                        }
                        if(arena[i+1][j]==2){
                            point+=2;
                        }
                    }
                    else if(j!=0 && j!=arena[0].length-1 && i==0){
                        if(arena[i][j-1]==2){
                            point+=2;
                        }
                        if(arena[i][j+1]==2){
                            point+=2;
                        }
                        if(arena[i+1][j]==2){
                            point+=2;
                        }
                    }
                    else if(j!=0 && j==arena[0].length-1 && i!=0 && i!= arena.length-1){
                        if(arena[i][j-1]==2){
                            point+=2;
                        }
                        if(arena[i-1][j]==2){
                            point+=2;
                        }
                        if(arena[i+1][j]==2){
                            point+=2;
                        }
                    }
                    else if(j!=0 && j!=arena[0].length-1 && i!=0 && i== arena.length-1){
                        if(arena[i][j-1]==2){
                            point+=2;
                        }
                        if(arena[i-1][j]==2){
                            point+=2;
                        }
                        if(arena[i][j+1]==2){
                            point+=2;
                        }
                    }
                    else{
                        if(arena[i][j-1]==2){
                            point+=2;
                        }
                        if(arena[i-1][j]==2){
                            point+=2;
                        }
                        if(arena[i][j+1]==2){
                            point+=2;
                        }
                        if(arena[i+1][j]==2){
                            point+=2;
                        }
                    }
                }
            }
        }
        System.out.printf("Points Gained: %d.",point);
        if(point<10)System.out.print("Your team is out.");
        else System.out.print(" Your team has survived the game.");

    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] arena = {
            {0,2,2,0},
            {50,1,2,0},
            {2,2,2,0},
            {1,100,2,0}
        };
        System.out.println("Given Arena: ");
        Arr.print2D(arena);
        
        System.out.println("\nExpected Output:");
        System.out.print("Points Gained: 6. Your team is out.\n");
        
        System.out.print("\nYour Output:\n");
        playGame( arena );

        System.out.print("\n======================\n");

        Integer[][] arena1 = {
            {0,2,2,0,2},
            {1,50,2,1,100},
            {2,2,2,0,2},
            {0,200,2,0,0}
        };
        System.out.println("\nGiven Arena: ");
        Arr.print2D(arena1);
        
        System.out.println("\nExpected Output:");
        System.out.print("Points Gained: 14. Your team has survived the game.\n");
        
        System.out.print("\nYour Output:\n");
        playGame( arena1 );
    }
}