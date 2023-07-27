package Algo.Queue;

import java.util.Queue;

public class CircularQueueImpl {
    private int capacity;
    private int front;
    private int rear;
    int arr[];

    public CircularQueueImpl(int capacity){
        this.front = -1;
        this.rear = -1;
        arr = new int[capacity];
    }
    public void push(int data){
        // check underflow (isFull)
        // first time insertion in queue
        // reassign rear to front and front!=0
        // normal insertion
        if(((front == 0 && rear == capacity-1) || (rear == front-1))){
            System.out.println("queue is full,can't push anymore");
        }else if(front == -1 && rear == -1){
            front = 0;
            rear = 0;
            arr[rear] = data;
        }else if(rear == capacity-1 && front != 0){
            rear = 0;
            arr[rear] = data;
        }else{
            ++rear;
            arr[rear] = data;
        }
    }
    public void pop(){
        // check underflow(isEmpty)
        // single element in the queue, front== rear
        // circular nature, front at last
        // normal flow
        if(front == -1 && rear == -1){
            System.out.println("queue is empty");
        }else if(front == rear){
            front = rear = -1;
        }else if (front == capacity-1){
            front = 0;
        }else{
            front++;
        }
    }
    public int getSize(){
        if(front == -1 && rear == -1){
            return 0;
        }else{
            int ans;
            ans = (rear - front);
           return (ans<0)?(ans*-1)+1:ans+1;
        }
    }
    public void print(){
        // check underflow
        if(front == -1 && rear == -1){
            System.out.println("queue is empty ");
        }else{
            int temp = front;
            while(temp!=rear){
                System.out.print(arr[temp]+" ");
                temp++;
            }
            System.out.println(arr[temp]);
        }
    }
}
