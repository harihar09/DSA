package Algo.SlidingWindow;

public class FirstNegativeNumberInSubArray {
    public static void main(String[] args) {
        int[] arr = {1, -2, -3, 4, 5, -6, 8};
        int k = 3;
        for (int i = 0; i <= arr.length - k; i++) {
            for (int j = i; j < k + i; j++) {
                if (arr[j] < 0) {
                    System.out.println(arr[j]);
                    break;
                }
            }
        }
    }
}
