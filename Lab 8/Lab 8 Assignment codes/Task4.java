public class Task4{
    public static Integer[] largestValue(Integer[] nums, int k){
        Integer[] result = new Integer[k];
        MaxHeap maxheap = new MaxHeap(nums.length);
        for(int i = 0; i < nums.length; i++) {
            maxheap.insert(nums[i]);
        }
        for (int i = 0; i < k; i++) {
            result[i] = maxheap.extractMax();
        }
        return result;
    }
}