package Algo.Queue;

public class QueueMainApp {
    public static void main(String[] args) {
        QueueImpl queue = new QueueImpl(5);
        queue.push(1);
        queue.push(2);
        queue.print();
        System.out.println("queue size "+queue.getSize());
        queue.pop();
        queue.pop();
        queue.print();
        System.out.println("queue size "+queue.getSize());
    }
}
