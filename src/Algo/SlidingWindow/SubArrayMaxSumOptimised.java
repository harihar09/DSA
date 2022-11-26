package Algo.SlidingWindow;

import java.util.Scanner;

public class SubArrayMaxSumOptimised {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int ArrSize = sc.nextInt();
        System.out.println("Enter "+ArrSize+" integers");
        int[] arr = new int[ArrSize];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter window size");
        int k = sc.nextInt();
        int start =0, end =0, sum=0,maxSum=0;
        while(end < arr.length){
            sum+=arr[end];
            if(end-start+1 < k){
                end++;
            }else if(end-start+1 == k){
                if(sum>maxSum){
                    maxSum=sum;
                }
                end++;
                if(end<arr.length) {
                    sum = sum - arr[start];
                    start++;
                }
            }
        }
        System.out.println("max sum of window "+k+" is "+maxSum);
    }
}
