package Algo.Searching;

import java.util.Scanner;

public class Binary {
    // 1,2,3,4,5 -> 5
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
        int start =0, end=size-1,mid=0;
        boolean flag = false;
        while(start<=end){
            mid = (start+end)/2;
            if(arr[mid] == number){
                flag = true;
                break;
            }else if(number > arr[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        if(flag){
            System.out.println(number+" found in the array at "+mid+" index");
        }else{
            System.out.println(number+" is not found in the array");
        }
    }
}
