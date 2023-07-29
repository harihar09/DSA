package Algo.Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class FirstNegativeInWindowK {
    public static void main(String[] args) {
        int k = 3;
        int[] arr = {1, -2, 3, -4, -5, 6};
        Queue<Integer> queue = new ArrayDeque<>();
        // process first window of size k
        for (int i = 0; i < k; i++) {
            if (arr[i] < 0) {
                queue.add(i);
            }
        }
        // process elements starting from k to n
        for (int i = k; i < arr.length; i++) {
            // print the answer
            if (!queue.isEmpty()) {
                System.out.println(arr[queue.peek()]);
            } else {
                System.out.println(0);
            }
            // remove out of window elements index from queue
            while (!queue.isEmpty() && i - queue.peek() >= k) {
                queue.poll();
            }
            //add next negative element index in the queue
            if (arr[i] < 0) {
                queue.add(i);
            }
        }
        if (!queue.isEmpty()) {
            System.out.println(arr[queue.peek()]);
        } else {
            System.out.println(0);
        }
    }
}
