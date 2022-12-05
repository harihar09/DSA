package Algo.Searching;

public class CeilingIndex {
    public static void main(String[] args) {
        int[] array = {1,2,4,6};
        int target = 3;
        System.out.println(ceilingIndex(array,target));
    }

    private static  int ceilingIndex(int[] arr, int target){
        int start = 0, end = arr.length-1, mid = 0;

        // search the element in an array, return ceiling index
        while(start<=end){
            mid = start +(end-start)/2;
            if(target == arr[mid]){
                return  mid;
            }else if(target > arr[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return start;
    }
}
