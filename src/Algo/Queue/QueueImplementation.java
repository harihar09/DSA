package Algo.Queue;

import java.util.Scanner;

public class QueueImplementation {
    public static void main(String[] args) {
        // get the array size from user
        // create the queue object to initialize the
        // front, rear, and array of entered size
        // try to push, pop, print, front and get the size of queue
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scanner.nextInt();
        Queue queue = new Queue(size);
        System.out.println("Queue of size " + size + " got created");
        queue.push(1);
        queue.push(2);
        queue.print();
        queue.getFront();
        queue.pop();
        queue.print();
        queue.push(5);
        queue.print();

    }
}

class Queue {
    private int size;
    private int[] arr;
    private int front;
    private int rear;

    public Queue(int size) {
        this.size = size;
        this.arr = new int[size];
        this.front = 0;
        this.rear = 0;
    }

    // push
    public void push(int data) {
        // check for overflow condition
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            // push the data in queue
            arr[rear++] = data;
        }
    }

    // pop
    public void pop() {
        // check the underflow condition
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            // remove the front data, i.e. set it to -1
            arr[front++] = -1;
            if (front == rear) {
                front = 0;
                rear = 0;
            }
        }
    }

    // get the front data from the queue
    public int getFront() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return -1;
        } else {
            return arr[front];
        }
    }

    // print the queue data
    public void print() {
        // print the data on console
        //check the underflow condition
        if (isEmpty()) {
            System.out.println("queue is empty");
        } else {
            for (int i = front; i < rear; i++) {
                System.out.println(arr[i]);
            }
        }
    }

    private boolean isEmpty() {
        return front == rear;
    }

    private boolean isFull() {
        return rear == size;
    }
}

