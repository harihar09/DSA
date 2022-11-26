package Algo.SlidingWindow;

import java.util.Arrays;
import java.util.Scanner;

public class SubArrayMaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int ArrSize = sc.nextInt();
        System.out.println("Enter "+ArrSize+" integers");
        int[] arr = new int[ArrSize];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter k");
        int k = sc.nextInt();
        int sum,maxSum=0;
        for(int i=0;i<=arr.length-k;i++){
            sum=0;
            for(int j=i;j<=i+(k-1);j++){
                sum+=arr[j];
            }
            if(sum>maxSum)
                maxSum=sum;
        }
        System.out.println("MaxSum of subArray with size "+k+" is "+maxSum);
    }
}
