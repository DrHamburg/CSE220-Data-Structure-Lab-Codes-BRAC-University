import java.util.Scanner;

public class Tester{
    public static void main(String[] args){
        System.out.println("Enter any number between 1 and 8.\nTo run all tasks just press enter");
        System.out.print("Which Task do you wanna check: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();


        if( input.equals("1") || input.equals("") ) task1();
        if( input.equals("2") || input.equals("") ) task2();
        if( input.equals("3") || input.equals("") ) task3();
        if( input.equals("4") || input.equals("") ) task4();
        if( input.equals("5") || input.equals("") ) task5();
        if( input.equals("6") || input.equals("") ) task6();
        if( input.equals("7") || input.equals("") ) task7();
        if( input.equals("8") || input.equals("") ) task8();
        taskPrint("\n===================== TheEnd =====================");
    }

    public static void task1() {
        taskPrint("\n===================== TASK#1 =====================\n");
        int vertices = 7;
        int[][] edges = {
                {1, 2}, {1, 3}, {1, 4}, {1, 7},
                {2, 3}, {2, 4}, {2, 6}, {2, 7},
                {3, 5}, {3, 6}, {3, 7},
                {4, 6}, {4, 7},
                {5, 6}, {5, 7},
                {6, 7}
        };
        task1 ungraph1 = new task1(vertices);
        ungraph1.addedges(edges);
        int degree = ungraph1.countMaxDegree();
        System.out.printf("Degree: %d", degree);
        System.out.println();
        System.out.println("--------------------------------------------------");
    }

    public static void task2() {
        taskPrint("\n===================== TASK#2 =====================\n");
        int vertices = 7;
        int[][] edges = {
                {1, 2, 1}, {1, 3, 2}, {1, 4, 3}, {1, 7, 4},
                {2, 3, 5}, {2, 4, 6}, {2, 6, 7}, {2, 7, 8},
                {3, 5, 9}, {3, 6, 10}, {3, 7, 11},
                {4, 6, 12}, {4, 7, 13},
                {5, 6, 14}, {5, 7, 15},
                {6, 7, 16}
        };
        task2 ungraph2 = new task2(vertices);
        ungraph2.addedges(edges);
        int vertex = ungraph2.maxWeightEdge();
        System.out.printf("Max Weight Vertex: %d", vertex);

        System.out.println();
        System.out.println("--------------------------------------------------");
    }

    public static void task3(){
        taskPrint("\n===================== TASK#3 =====================");
        int vertices = 7;
        int[][] edges = {
                {1, 2, 1}, {1, 3, 2}, {1, 4, 3}, {1, 7, 4},
                {2, 3, 5}, {2, 4, 6}, {2, 6, 7}, {2, 7, 8},
                {3, 5, 9}, {3, 6, 10}, {3, 7, 11},
                {4, 6, 12}, {4, 7, 13},
                {5, 6, 14}, {5, 7, 15},
                {6, 7, 16}
        };
        task3 ungraph3 = new task3(vertices);
        ungraph3.addedges(edges);
        int degree = ungraph3.maxDegree();
        System.out.printf("degree: %d\n", degree);
        int maxWvertex = ungraph3.maxWeightEdge();
        System.out.printf("Max Weight Vertex: %d", maxWvertex);
        System.out.println();
        System.out.println("--------------------------------------------------");
    }

    public static void task4(){
        taskPrint("\n===================== TASK#4 =====================\n");
        int vertices = 7;
        int[][] edges = {
                {1, 2, 1}, {1, 3, 2}, {1, 4, 3}, {1, 7, 4},
                {2, 3, 5}, {2, 4, 6}, {2, 6, 7}, {2, 7, 8},
                {3, 5, 9}, {3, 6, 10}, {3, 7, 11},
                {4, 6, 12}, {4, 7, 13},
                {5, 6, 14}, {5, 7, 15},
                {6, 7, 16}
        };
        task4 ungraph4 = new task4(vertices);
        ungraph4.addedges(edges);
        ungraph4.undirected();
        ungraph4.printadj_mat();
        System.out.println();
        System.out.println("--------------------------------------------------");
    }

    public static void task5() {
        taskPrint("\n===================== TASK#5 =====================\n");
        int vertices = 7;
        int[][] edges = {
                {1, 2}, {1, 3}, {1, 4}, {1, 7},
                {2, 3}, {2, 4}, {2, 6}, {2, 7},
                {3, 5}, {3, 6}, {3, 7},
                {4, 6}, {4, 7},
                {5, 6}, {5, 7},
                {6, 7}
        };
        task5 ungraph5 = new task5(vertices);
        ungraph5.addedges(edges);
        ungraph5.printList();
        int degree = ungraph5.maxDegree();
        System.out.printf("Degree: %d\n",degree);
        System.out.println();
        System.out.println("--------------------------------------------------");
    }
    public static void task6() {
        taskPrint("\n===================== TASK#6 =====================\n");
        int vertices = 7;
        int[][] edges = {
                {1, 2, 1}, {1, 3, 2}, {1, 4, 3}, {1, 7, 4},
                {2, 3, 5}, {2, 4, 6}, {2, 6, 7}, {2, 7, 8},
                {3, 5, 9}, {3, 6, 10}, {3, 7, 11},
                {4, 6, 12}, {4, 7, 13},
                {5, 6, 14}, {5, 7, 15},
                {6, 7, 16}
        };
        task6 ungraph6 = new task6(vertices);
        ungraph6.addedges(edges);
        ungraph6.printList();
        ungraph6.maxweightVertex();

        System.out.println();
        System.out.println("--------------------------------------------------");
    }
    public static void task7() {
        taskPrint("\n===================== TASK#7 =====================\n");
        int vertices = 7;
        int[][] edges = {
                {1, 2, 1}, {1, 3, 2}, {1, 4, 3}, {1, 7, 4},
                {2, 3, 5}, {2, 4, 6}, {2, 6, 7}, {2, 7, 8},
                {3, 5, 9}, {3, 6, 10}, {3, 7, 11},
                {4, 6, 12}, {4, 7, 13},
                {5, 6, 14}, {5, 7, 15},
                {6, 7, 16}
        };
        task7 ungraph7 = new task7(vertices);
        ungraph7.addedges(edges);
        ungraph7.printList();
        int degree = ungraph7.maxDegree();
        System.out.printf("Degree: %d\n",degree);
        ungraph7.maxweightVertex();

        System.out.println();
        System.out.println("--------------------------------------------------");
    }

    public static void task8() {
        taskPrint("\n===================== TASK#8 =====================\n");
        int vertices = 7;
        int[][] edges = {
                {1, 2, 1}, {1, 3, 2}, {1, 4, 3}, {1, 7, 4},
                {2, 3, 5}, {2, 4, 6}, {2, 6, 7}, {2, 7, 8},
                {3, 5, 9}, {3, 6, 10}, {3, 7, 11},
                {4, 6, 12}, {4, 7, 13},
                {5, 6, 14}, {5, 7, 15},
                {6, 7, 16}
        };
        task8 ungraph8 = new task8(vertices);
        ungraph8.addedges(edges);
        ungraph8.printListDir();
        ungraph8.dirToUndir();
        System.out.println();
        System.out.println("--------------------------------------------------");
    }
    static final String green = "\u001B[32m", red = "\u001B[31m", white = "\u001B[37m", cyan = "\033[0;96m";
    static final String bold="\u001B[1m", underline = "\u001B[4m", normal = "\033[0;0m";

    static String taskFormat = cyan;
    static String endFormat = green;

    private static void taskPrint(String task){
        System.out.println(taskFormat+task+endFormat);
    }
}


//========================================================END Code==========================================================

