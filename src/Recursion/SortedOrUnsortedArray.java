package Recursion;

import java.util.Scanner;

public class SortedOrUnsortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,0,5};
        int index=1;
       boolean ans =  sortedOrUnsorted(arr,index);
        System.out.println(ans);
    }

    private static boolean sortedOrUnsorted(int[] arr, int index) {
        if(index >= arr.length)
            return true;
        if(arr[index] < arr[index-1])
            return  false;
       return  sortedOrUnsorted(arr,index+1);
    }
}
