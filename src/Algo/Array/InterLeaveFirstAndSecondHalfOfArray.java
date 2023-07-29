package Algo.Array;

import java.util.Arrays;

public class InterLeaveFirstAndSecondHalfOfArray {
    // i/p - 1,2,3,4,5,6  o/p 1,4,2,5,3,6
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int[] ans = new int[arr.length];
        int i=0,j=arr.length/2,k=0,x=0;
        while(k++<arr.length/2){
            ans[x++] = arr[i++];
            ans[x++] = arr[j++];
        }
        System.out.println("After interleave "+ Arrays.toString(ans));
    }
}
