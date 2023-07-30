package Algo.Queue;

public class MaxInWindowSizeKWithoutOptimization {
    public static void main(String[] args) {
        // time - O(n2)
        // space - O(1)
        int k = 3; // window size
        int[] arr = {1, 2, 3, -3, 5, 6, 7};
        for (int i = 0; i <= arr.length - k; i++) {
            int max = arr[i];
            for (int j = i; j < k + i; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            System.out.print(max + " ");
        }
    }
}
