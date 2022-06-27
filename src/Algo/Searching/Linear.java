package Algo.Searching;

import java.util.Scanner;

public class Linear {

    // 2,3,4,7,10 -> 15
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        System.out.println("Enter "+size+" numbers");
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter number ");
        int number = sc.nextInt();
        boolean flag = false;
        int i;
        for( i=0;i<size;i++){
           if(arr[i]==number){
               flag = true;
               break;
           }
        }
        if(flag)
            System.out.println(number +" found in array at "+i+" index");
        else
            System.out.println(number+ " is not found in the array");
        }
    }


