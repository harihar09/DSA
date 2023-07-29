package Algo.Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class ReverseQueueUsingRecursion {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue);
        reverse(queue);
        System.out.println(queue);
    }

    // you do the one step and let recursion handle the remaining part
    // and add the element at last
    // e.g. 1,2,3,4,5 -> 1 --- 5,4,3,2 and add 1 at last -> 5,4,3,2,1
    private static void reverse(Queue<Integer> queue) {
        if (queue.isEmpty())
            return;
        int temp = queue.poll();
        reverse(queue);
        queue.add(temp);
    }
}
