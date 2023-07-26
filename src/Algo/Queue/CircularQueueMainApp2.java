package Algo.Queue;

import java.util.Scanner;

public class CircularQueueMainApp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the queue size");
        int size = sc.nextInt();
        // create the circular queue obj and initialize the front, rear,size and queue
        CircularQueueImpl2 queue = new CircularQueueImpl2(size);
        queue.push(10);
        queue.push(20);
        queue.print();
        queue.push(40);
        queue.print();
        queue.push(50);
        queue.pop();
        queue.print();
        queue.pop();
        queue.pop();
        queue.print();
        queue.pop();
    }
}
