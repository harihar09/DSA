package Algo.Searching;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
       int[] array ={1,2,3,4,5,6};
       int target =2;
       int start =0, end = array.length-1,mid=0;
        System.out.println(recursiveSearch(array,target,mid,start,end));
    }

    private static int recursiveSearch(int[] array, int target, int mid, int start, int end) {
        if (end < start) {
            return -1;
        }
        mid = start + (end - start) / 2;
        if (target == array[mid]) {
            return mid;
        } else if (target > array[mid]) {
            return recursiveSearch(array, target, mid, mid + 1, end);
        } else {
            return recursiveSearch(array, target, mid, start, mid - 1);
        }
    }
}
