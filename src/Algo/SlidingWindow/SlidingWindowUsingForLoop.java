package Algo.SlidingWindow;

import java.util.Scanner;

public class SlidingWindowUsingForLoop {
    // {1,2,3,4,5,6} -> {{1,2,3},{2,3,4},{3,4,5},{4,5,6},{5,6,7}}
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
        int window = sc.nextInt();
        int sum;
        int maxSum = 0;
        int k = 0;
        // total windows = size - window + 1
        System.out.print("{");
        for (int i = 0; i < size - window + 1; i++) {
            sum = 0;
            System.out.print("{");
            for (int j = i; j < window + i; j++) {
                System.out.print(arr[j]);
                if (j < window + i - 1) {
                    System.out.print(",");
                }
                sum = sum + arr[j];
            }
            if (sum > maxSum) {
                k = i;
                maxSum = sum;
            }
            System.out.print("}");
            if (i < size - window) {
                System.out.print(",");
            }
        }
        System.out.println("}");
        System.out.print("{");
        for (int i = k; i < window+k; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.print("}"+"\n");
        System.out.println("Maximum sum is " + maxSum);

    }
}
