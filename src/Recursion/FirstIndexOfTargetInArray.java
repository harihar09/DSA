package Recursion;

public class FirstIndexOfTargetInArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,43,4,3,4,2,3};
        int target = 4;
        int firstIndex = getFirstIndex(arr, arr.length-1, target);
        System.out.println("first index is "+firstIndex);
    }

    private static int getFirstIndex(int[] arr, int index,int target) {
        if(index >= arr.length){
            return -1;
        }
        if(arr[index]==target ){
            return index;
        }

       return  getFirstIndex(arr,--index,target);
    }
}
