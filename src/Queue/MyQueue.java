package Queue;

public class MyQueue {

    int rear;
    int front;
    int size;
    int capacity;
    int queue[];
    public MyQueue(int capacity) {
        queue = new int[capacity];
        this.capacity = capacity;
        size = 0;
        front = -1;
        rear = -1;
    }
    public boolean isEmpty() {
        if (front == -1) {
            return true;
        }
        else {
            return false;
        }
    }
    public boolean isFull(){
        if(rear == capacity - 1){
            return true;
        }
        else return false;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("The queue is empty");
            return -1;
        }
        return queue[front];
    }
    public void enqueue(int val){
        if(isFull()){
            System.out.println("Queue is Full");
            return;
        }
        if (isEmpty()){
            front = 0;
            rear = 0;
        }
        else {
            rear++;
        }
        size++;
        queue[rear] = val;
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("The queue is empty");
            return -1;
        }
        int val = queue[front];
        if (front == rear){
            front = -1;
            rear = -1;
        }else {
            front++;
        }
        size--;
        return val;
    }
    public int size(){
        return size;
    }
    public void printQueue(){
        if (isEmpty()){
            System.out.println("The queue is empty");
            return;
        }
        for (int i = front;i<rear;i++){
            System.out.print(queue[i]+" ");
            if (i!=rear){
                System.out.print(",");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(5);
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.printQueue();
    }
}
