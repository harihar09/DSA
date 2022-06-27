package Algo.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Selection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        System.out.println("Enter "+size+" numbers");
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] =sc.nextInt();
        }
        int min;
        boolean flag = false;
        for(int i=0;i<arr.length-1;i++){
            min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min = j;
                   flag = true;
                }
            }
            if(flag){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
                flag = false;
            }
        }
        System.out.println("Sorted array "+ Arrays.toString(arr));
    }
}
