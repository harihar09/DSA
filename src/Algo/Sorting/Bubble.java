package Algo.Sorting;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Bubble {
    // 3,4,1,5 -> 1,3,4,5
    //3,1,4,  5 for i=0
    //1,3    4, 5 for i=1
    //1  3, 4, 5 for i=2

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        System.out.println("Enter "+size+" numbers");
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] =sc.nextInt();
        }
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j] >arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted Array "+ Arrays.toString(arr));
    }

}
