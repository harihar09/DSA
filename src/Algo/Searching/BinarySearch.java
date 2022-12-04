package Algo.Searching;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};
        int target = 10;
        System.out.println(binarySearch(array,target));
    }
   // search the target in an array and return index else -1
    private static int binarySearch(int[] array,int target){
        int start = 0, end = array.length-1, mid = 0;

        while(start <= end){
            mid = start +(end-start)/2;
            if(target == array[mid]){
                return mid;
            }else if(target > array[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}
