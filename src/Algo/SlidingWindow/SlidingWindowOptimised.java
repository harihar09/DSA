package Algo.SlidingWindow;

public class SlidingWindowOptimised {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, -4, 5, -6};
        int k = 3;
        int sum = 0, maxSum;
        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }
        maxSum = sum;
        for (int j = k; j < arr.length; j++) {
            sum = sum + arr[j] - arr[j - k];
            maxSum = Math.max(sum, maxSum);
        }
        System.out.println("maxSum is " + maxSum);
    }
}
