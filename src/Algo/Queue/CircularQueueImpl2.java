package Algo.Queue;

public class CircularQueueImpl2 {
    private int size;
    private int[] queue;
    private int front;
    private int rear;

    public CircularQueueImpl2(int size) {
        this.size = size;
        this.queue = new int[size];
        this.front = -1;
        this.rear = -1;
    }

    // this will push the data in queue from back side i.e. rear
    public void push(int data) {
        // overflow
        // first time insertion
        // circular nature
        // normal insertion
        if (isFull()) {
            System.out.println("queue is full,can't push any data");
        } else if (front == -1) {
            front = rear = 0;
            queue[rear] = data;
        } else if (rear == queue.length - 1 && front != 0) {
            rear = 0;
            queue[rear] = data;
        } else {
            queue[++rear] = data;
        }
    }

    // this will pop the data
    public void pop() {
        // underflow
        // single element
        // circular nature
        // normal pop

        if (isEmpty()) {
            System.out.println("queue is empty,nothing to pop");
        } else if (front == rear) {
            queue[front] = -1;
            front = rear = -1;
        } else if (front == size - 1) {
            queue[front] = -1;
            front = 0;
        } else {
            queue[front] = -1;
            front++;
        }
    }

    //this will print the data
    public void print() {
        // underflow
        if (isEmpty()) {
            System.out.println("queue is empty, nothing to print.");
        } else {
            for (int i = front; i <= rear; ++i) {
                System.out.print(queue[i] + " ");
                if (i == size - 1 && i != rear) {
                    i = -1;
                }
            }
            System.out.println();
        }
    }

    //this will return true if the queue is empty else false
    private boolean isEmpty() {
        return front == -1;
    }

    // this will return true if the queue is full else false
    private boolean isFull() {
        return (front == 0 && rear == queue.length - 1) || (rear == front - 1);
    }
}
