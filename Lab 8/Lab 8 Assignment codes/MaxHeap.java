public class MaxHeap{
    private static int size;
    private static Integer[] arr;
    private static int capacity;
    MaxHeap(int capacity){
        this.size = 0;
        this.capacity = capacity;
        this.arr = new Integer[capacity];
    }

    public static void insert(Integer elem){
        if(size<capacity){
            arr[size] = elem;
            swim(size);
            size++;
        }else{
            System.out.print("Heap Array is Full\n");
        }
    }
 // Swim works for order
    public static void swim(int idx){
        int parent = (idx-1)/2;
        if(idx>0 && arr[idx]>arr[parent]){
            Integer temp = arr[parent];
            arr[parent] = arr[idx];
            arr[idx] = temp;
            swim(parent);
        }
    }

    public static Integer extractMax(){
        if(size == 0){
            System.out.print("Heap Array is Empty\n");
            return 0;
        }else{
            Integer max = arr[0];
            arr[0] = arr[size-1];
            size--;
            sink(0);
            return max;
        }
    }

    public static void sink(int idx){
        int maximum = idx;
        int left = 2*idx+1;
        int right = 2*idx+2;
        if(left<size && arr[left]> arr[maximum]){
            maximum = left;
        }
        if(right<size && arr[right]> arr[maximum]){
            maximum = right;
        }
        if(maximum != idx){
            Integer temp = arr[maximum];
            arr[maximum] = arr[idx];
            arr[idx] = temp;
            sink(maximum);
        }
    }

    public static void sort(){
        int tempsize = size;
        for (int i = size-1;i>=0;i--) {
            Integer temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            size--;
            sink(0);
        }
        size= tempsize;
    }
}