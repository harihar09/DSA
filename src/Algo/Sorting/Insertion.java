package Algo.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        System.out.println("Enter "+size+" numbers");
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] =sc.nextInt();
        }
        int value,hole;
        for(int i=1;i<arr.length;i++){
            value = arr[i];
            hole=i;
            while(hole >0 && arr[hole-1] >value){
                arr[hole]=arr[hole-1];
                hole = hole-1;
            }
            arr[hole]=value;
        }
        System.out.println("Sorted array "+ Arrays.toString(arr));
    }
}
