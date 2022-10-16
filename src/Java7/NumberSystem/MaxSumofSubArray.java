package Java7.NumberSystem;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSumofSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();   //5
        System.out.println("Enter "+n+"numbers");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int sum,maxSum=0;
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<n-2;i++){
            sum=0;
            for(int j=i;j<=i+2;j++){
                sum +=arr[j];
            }
            System.out.println("sum"+sum);
            if(sum>maxSum)
                maxSum = sum;

        }
        System.out.println("maxSum"+maxSum);
    }
}
