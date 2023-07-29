package Algo.Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElements {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        int k = 2, i = 0;
        if (k > 0 && k <= queue.size()) {
            Stack<Integer> stack = new Stack<>();
            while (i++ < k) {
                stack.push(queue.poll());
            }
            while (!stack.isEmpty()) {
                queue.add(stack.pop());
            }
            i = 0;
            while (i++ < queue.size() - k) {
                int element = queue.poll();
                queue.add(element);
            }
            System.out.println("reversed queue " + queue);
        }else {
            System.out.println(queue);
        }
    }
}
