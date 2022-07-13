package CP.LeetCode;

import java.util.Scanner;

public class TwoSum {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + "numbers");
        for (int i = 0; i <size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter k");
        int k = sc.nextInt();
        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]+arr[j]==k){
                    System.out.println("{"+arr[i]+","+arr[j]+"}");
                }
            }
        }
    }
}
