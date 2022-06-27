package CP;

import java.util.Arrays;
import java.util.Scanner;

public class SubArrayMaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter array size");
            int size = sc.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter " + size + " numbers");
            for (int i = 0; i <size; i++) {
                arr[i] = sc.nextInt();
            }
            int sum=0,maxSum=0;
            for(int i=0;i<arr.length;i++){
                sum+=arr[i];
                if(sum>maxSum) {
                    maxSum = sum;
                }
                if(sum<0){
                    sum=0;
                }
            }
        System.out.println("MaxSum "+maxSum);
    }
}
