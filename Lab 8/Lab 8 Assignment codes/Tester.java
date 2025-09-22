import java.util.Scanner;

public class Tester{
    public static void main(String[] args){
        System.out.println("Enter any number between 1 and 4.\nTo run all tasks just press enter");
        System.out.print("Which Task do you wanna check: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();


        if( input.equals("1") || input.equals("") ) task1();
        if( input.equals("2") || input.equals("") ) task2();
        if( input.equals("3") || input.equals("") ) task3();
        if( input.equals("4") || input.equals("") ) task4();
        taskPrint("\n===================== TheEnd =====================");
    }

    public static void task1() {
        taskPrint("\n===================== TASK#1 =====================\n");
        Integer[] heap = {2, 4, 7, 1, 6};
        Integer[] minheapTester = new Integer[heap.length];

        MinHeap minheap = new MinHeap(heap.length);
        for(int i = 0; i < heap.length; i++) {
            minheap.insert(heap[i]);
        }
        System.out.println("Original Array: 2 4 7 1 6");

        if(heap.length==0){
            minheap.extractMin();
        }else{
            System.out.print("Heap Array: ");
        }
        for(int i = 0; i < minheapTester.length; i++) {
            minheapTester[i] = minheap.extractMin();
            System.out.print(minheapTester[i]+" ");
        }
        System.out.println();
        System.out.println("--------------------------------------------------");
    }

    public static void task2() {
        taskPrint("\n===================== TASK#2 =====================\n");
        Integer[] heap = {};
        Integer[] maxheapTester = new Integer[heap.length];

        MaxHeap maxheap = new MaxHeap(heap.length);
        for(int i = 0; i < heap.length; i++) {
            maxheap.insert(heap[i]);
        }
        System.out.println("Original Array: 2 4 7 1 6");
        if(heap.length==0){
            maxheap.extractMax();
        }else{
            System.out.print("Heap Array: ");
        }
        for(int i = 0; i < maxheapTester.length; i++) {
            maxheapTester[i] = maxheap.extractMax();
            System.out.print(maxheapTester[i]+" ");
        }
        System.out.println();
        System.out.println("--------------------------------------------------");
    }

    public static void task3(){
        taskPrint("\n===================== TASK#3 =====================");
        Integer [] tasks = {2,4,7,1,6};
        int m = 4;
        Integer [] newTasks = Task3.processingTime(tasks,m);
        System.out.print("Expected Output: 2 4 7 7\n");
        System.out.print("Your Output    :");
        for (int i = 0; i < m; i++) {
            System.out.print(" "+newTasks[i]);
        }
        System.out.println();
        System.out.println("--------------------------------------------------");
    }

    public static void task4(){
        taskPrint("\n===================== TASK#4 =====================\n");
        Integer [] nums = {4, 10, 2, 8, 6, 7};
        int k = 3;
        Integer [] largestValue = Task4.largestValue(nums,k);
        System.out.print("Expected Output: 10 8 7\n");
        System.out.print("Your Output    :");
        for (int i = 0; i < k; i++) {
            System.out.print(" "+largestValue[i]);
        }
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

