package Algo.SlidingWindow;

import java.util.Scanner;

public class SlidingWindowUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter " + size + " integers");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter window size");
        int k = sc.nextInt();
        int i = 0, j = 0, sum = 0, maxSum = 0;
        while (j < size) {
            sum = sum + arr[j];
            //till we get window size increase j
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) { // window size, get maxSum, remove ith element from sum
                maxSum = Math.max(sum, maxSum);
                sum = sum - arr[i];
                i++;
                j++;
            }
        }
        System.out.println("maxSum is " + maxSum);
    }
}
