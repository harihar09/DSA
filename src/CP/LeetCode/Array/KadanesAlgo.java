package CP.LeetCode.Array;

import java.util.Scanner;

public class KadanesAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        System.out.println("Enter "+size+" numbers");
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
           arr[i]=sc.nextInt();
        }
        int sum = 0,maxSum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>maxSum)
                maxSum=sum;
            if(sum<0)
                sum=0;
        }
        System.out.println("MaxSUm of subArray "+maxSum);
    }
}
