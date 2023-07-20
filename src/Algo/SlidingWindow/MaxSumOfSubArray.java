package Algo.SlidingWindow;

public class MaxSumOfSubArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 5,-1};
        int k = 3, j = 0, i = 0, sum = 0, maxSum = 0;
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
