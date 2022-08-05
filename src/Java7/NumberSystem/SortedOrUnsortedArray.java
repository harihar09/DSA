package Java7.NumberSystem;

import java.util.Arrays;
import java.util.Scanner;

public class SortedOrUnsortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" numbers");
        int []arr = new int[n];
        for(int i=0;i<n;arr[i++]=sc.nextInt());
        System.out.println(Arrays.toString(arr));
        boolean flag = true;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    flag = false;
                    break;
                }
            }
            if(!flag)
                break;
        }
        if(flag)
            System.out.println("sorted");
        else
            System.out.println("unsorted");


    }
}
