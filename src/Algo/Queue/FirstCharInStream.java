package Algo.Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class FirstCharInStream {
    public static void main(String[] args) {

        String string = "abcdefgac";
        char[] arr = string.toCharArray();
        int[] freq = new int[26];
        Queue<Character> queue = new ArrayDeque<>();
        for (int i = 0; i < arr.length; i++) {
            // count the frequency of character
            freq[arr[i] - 'a']++;
            // push it into queue
            queue.add(arr[i]);

            while (!queue.isEmpty()) {
                // if the front character is duplicate then remove it from queue
                // else print the front char as answer
                if (freq[queue.peek() - 'a'] > 1) {
                    queue.poll();
                } else {
                    System.out.print(queue.peek());
                    break;
                }
            }
            if (queue.isEmpty()) {
                System.out.print("#");
            }
        }
    }
}
