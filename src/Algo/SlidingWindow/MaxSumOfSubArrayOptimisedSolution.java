package Algo.SlidingWindow;

public class MaxSumOfSubArrayOptimisedSolution {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, -5, 6,3};
        int i = 0, j = 0, sum = 0, k = 3, maxSum = 0;
        while (j < arr.length) {
            sum = sum + arr[j];
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                maxSum = Math.max(sum, maxSum);
                sum = sum - arr[i];
                i++;
                j++;
            }
        }
        System.out.println("maxSum is " + maxSum);
    }
}
