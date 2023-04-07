package CP.LeetCode.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AllSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter test");
        int T = sc.nextInt();
        while (T-- > 0) {
            System.out.println("Enter array size");
            int size = sc.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter n");
            int n = sc.nextInt();
            System.out.println("Enter " + size + "numbers");
            for (int i = 0; i <size; i++) {
                arr[i] = sc.nextInt();
            }
            int sum, x, count;
            boolean flag = false;
           // System.out.println("Enter k");
            //int K = sc.nextInt();
            int[] tempArr = new int[arr.length];
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                for (int j = i; j < arr.length; j++) {
                    sum = 0;
                    x = 0;
                    count = 0;
                    for (int k = i; k <= j; k++) {
                        System.out.print(arr[k] + ",");
                        sum += arr[k];
                        tempArr[x++] = arr[k];
                        count++;
                    }
                    System.out.println("sum " + sum);
                    if (sum <= n && count > 1) {
                        Arrays.sort(tempArr);
                        flag = true;
                    }
                    list.add(sum);
                }
            }
            System.out.println("Max sum of sub Array " + list.stream().max(Integer::compare).get());
            if (flag)
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}