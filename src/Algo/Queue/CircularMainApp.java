package Algo.Queue;

public class CircularMainApp {

    public static void main(String[] args) {
        CircularQueueImpl circularQueue = new CircularQueueImpl(4);
        circularQueue.push(1);
        circularQueue.push(2);
        circularQueue.print();
        System.out.println("size "+ circularQueue.getSize());
        circularQueue.push(3);
        circularQueue.push(4);
        circularQueue.print();
        circularQueue.pop();
        circularQueue.print();
        System.out.println("size "+ circularQueue.getSize());
        circularQueue.pop();
        circularQueue.print();
        System.out.println("size "+ circularQueue.getSize());
        circularQueue.pop();
        circularQueue.print();
        circularQueue.pop();
        circularQueue.print();
        circularQueue.push(3);
        circularQueue.print();
        System.out.println("size "+ circularQueue.getSize());
    }
}
