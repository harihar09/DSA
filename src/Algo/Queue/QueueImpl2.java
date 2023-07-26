package Algo.Queue;

public class QueueImpl2 {
    private int size;
    private int[] queue;
    private int front;
    private int rear;

    public QueueImpl2(int size) {
        this.size = size;
        this.queue = new int[size];
        this.front = 0;
        this.rear = 0;
    }

    // implement push operation here
    // this will insert the data into queue if it's not full
    public void push(int data) {
        if (isFull()) {
            System.out.println("queue is full,can't push the data");
        } else {
            queue[rear] = data;
            rear++;
        }
    }

    // this will pop the element from queue
    public void pop() {
        if (isEmpty()) {
            System.out.println("queue is empty,nothing to pop");
        } else {
            queue[front] = -1;
            front++;
        }
        if (front == rear) {
            front = rear = 0;
        }
    }

    // this will print the front element from queue
    public void front() {
        if (isEmpty()) {
            System.out.println("queue is empty");
        } else {
            System.out.println(queue[front]);
        }

    }

    // this will print the size of queue on console
    public void size() {
        System.out.println("queue size " + (rear - front));
    }

    // this will print the data to console
    public void print() {
        if (isEmpty()) {
            System.out.println("queue is empty, nothing to print");
        } else {
            for (int i = front; i < rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    // this will return true if the queue is empty else false
    private boolean isEmpty() {
        return front == rear;
    }

    // this will return true if the queue is full else false
    private boolean isFull() {
        return rear == size;
    }
}
