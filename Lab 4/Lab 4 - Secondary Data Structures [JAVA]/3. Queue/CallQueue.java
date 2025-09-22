//YOU NEED TO RUN THIS CLASS TO TEST OUT THE METHODS
//YOU NEED TO ONLY WRITE THE FOLLOWING METHODS
// enqueueCall()
// dequeueCall()
// displayQueue()
// Inside of these methods you need to utilize the LinkedListQueue class methods
// vipQueue and regularQueue objects are already created for you
class CallQueue {

    private LinkedListQueue vipQueue;
    // VIP queue
    private LinkedListQueue regularQueue;
    // Regular queue

    //DO NOT CHANGE THIS CONSTRUCTOR
    public CallQueue() {
        this.vipQueue = new LinkedListQueue();
        this.regularQueue = new LinkedListQueue();
    }

    public void enqueueCall(int customerId, boolean isVip) {
        if(isVip){
            vipQueue.enqueue(customerId);
            System.out.printf("Customer %d added to VIP queue.\n",customerId);
        }else{
            regularQueue.enqueue(customerId);
            System.out.printf("Customer %d added to Regular queue.\n",customerId);
        }
    }

    public void dequeueCall() {
        if(!vipQueue.isEmpty()){
           System.out.printf("Processing VIP Customer %d.\n",vipQueue.peek());
           vipQueue.dequeue();
        }else if(!regularQueue.isEmpty()){
            System.out.printf("Processing Regular Customer %d.\n",regularQueue.peek());
            regularQueue.dequeue();
        }else{
            System.out.print("No calls in the queue.\n");
        }
    }

    public void displayQueue() {
        System.out.print("VIP Queue:\n");
        vipQueue.displayQueue();
        System.out.print("Regular Queue:\n");
        regularQueue.displayQueue();
    }

    public static void main(String[] args) {
        //      ::Expected Output::
        // Customer 101 added to Regular queue.
        // Customer 201 added to VIP queue.
        // Customer 102 added to Regular queue.
        // Customer 202 added to VIP queue.
        // Customer 103 added to Regular queue.

        // VIP Queue:
        // Queue (front to rear): 201 -> 202 -> NULL
        // Regular Queue:
        // Queue (front to rear): 101 -> 102 -> 103 -> NULL

        // Processing VIP Customer 201.
        // Processing VIP Customer 202.
        // Processing Regular Customer 101.
        // Processing Regular Customer 102.
        // Processing Regular Customer 103.
        // No calls in the queue.

        // VIP Queue:
        // Queue (front to rear): NULL
        // Regular Queue:
        // Queue (front to rear): NULL

        CallQueue callCenter = new CallQueue();
        // Enqueueing customers 
        callCenter.enqueueCall(101, false);
        // Regular customer
        callCenter.enqueueCall(201, true);
        // VIP customer
        callCenter.enqueueCall(102, false);
        // Regular customer
        callCenter.enqueueCall(202, true);
        // VIP customer
        callCenter.enqueueCall(103, false);
        // Regular customer
        callCenter.displayQueue();
        // Processing calls
        callCenter.dequeueCall();
        callCenter.dequeueCall();
        callCenter.dequeueCall();
        callCenter.dequeueCall();
        callCenter.dequeueCall();
        callCenter.dequeueCall();
        // No more calls
        callCenter.displayQueue();
    }
}