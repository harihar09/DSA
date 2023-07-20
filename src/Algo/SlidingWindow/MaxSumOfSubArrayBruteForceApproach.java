package Algo.SlidingWindow;

public class MaxSumOfSubArrayBruteForceApproach {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 3, sum, maxSum = 0;
        for (int i = 0; i <= arr.length - k; i++) {
            sum = 0;
            for (int j = i; j < k + i; j++) {
                sum += arr[j];
            }
            maxSum = Math.max(sum, maxSum);
        }
        System.out.println("maxSum is " + maxSum);
    }
}
