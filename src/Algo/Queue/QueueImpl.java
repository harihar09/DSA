package Algo.Queue;

public class QueueImpl {
    private int capacity;
    private int arr[];
    private int front;
    private int rear;

    public QueueImpl(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
        this.front = 0;
        this.rear = 0;
    }
    public void push(int data){
        // check overflow
        if(rear == capacity){
            System.out.println("queue is full");
        }else{
            arr[rear] = data;
            rear++;
        }
    }
    public void pop(){
        // check underflow
        if(front == rear){
            System.out.println("queue is empty");
        }else{
            arr[front] = -1;
            front++;
            if(front == rear){
                front = 0;
                rear = 0;
            }

        }
    }
    public int getSize(){
        // check underflow
        return front == rear ? 0 : rear-front;
    }
    public void print(){
        // check underflow
        if(front == rear){
            System.out.println("queue is empty");
        }else{
            for(int i=front;i<rear;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}
