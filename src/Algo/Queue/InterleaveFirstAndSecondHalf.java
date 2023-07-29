package Algo.Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class InterleaveFirstAndSecondHalf {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
       // queue.add(6);

        // first step is to add first half elements of original queue to
        // another queue
        // second step is to keep on adding one-one elements from these two
        // queues to new queue
        Queue<Integer> firstHalf = new ArrayDeque<>();
        int i = 0, halfLen = queue.size() / 2, len = queue.size();
        while (i++ < halfLen) {
            firstHalf.add(queue.poll());
        }
        i = 0;
        while (i++ < halfLen) {
            queue.add(firstHalf.poll());
            queue.add(queue.poll());
        }
        if(len%2!=0){
            queue.add(queue.poll());
        }
        System.out.println("final queue " + queue);
    }
}
