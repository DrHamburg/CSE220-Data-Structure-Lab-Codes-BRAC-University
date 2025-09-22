public class MinHeap{
    private static int size;
    private static Integer[] arr;
    private static int capacity;
    MinHeap(int capacity){
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

    public static void swim(int idx){
        int parent = (idx-1)/2;
        if(idx>0 && arr[idx]<arr[parent]){
            Integer temp = arr[parent];
            arr[parent] = arr[idx];
            arr[idx] = temp;
            swim(parent);
        }
    }

    public static Integer extractMin(){
        if(size == 0){
            System.out.print("Heap Array is Empty\n");
            return 0;
        }else{
            Integer min = arr[0];
            arr[0] = arr[size-1];
            size--;
            sink(0);
            return min;
        }
    }

    public static void sink(int idx){
        int minimum = idx;
        int left = 2*idx+1;
        int right = 2*idx+2;
        if(left<size && arr[left]< arr[minimum]){
            minimum = left;
        }
        if(right<size && arr[right]< arr[minimum]){
            minimum = right;
        }
        if(minimum != idx){
            Integer temp = arr[minimum];
            arr[minimum] = arr[idx];
            arr[idx] = temp;
            sink(minimum);
        }
    }

    public static void sort(){
        int tempSize = size;
        for (int i = size-1;i>=0;i--) {
            Integer temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            size--;
            sink(0);
        }
        size = tempSize;
    }
}