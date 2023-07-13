package Recursion;

public class MaxNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1, 5, 7,10};
        int max = arr[0];
        int index = 1;
        // using iterative
      /*  for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }*/
      //  System.out.println("max is " + max);
        // using recursion
        System.out.println("max is "+getMax(arr,index,max));
    }
    private static int getMax(int [] arr, int index,int max){
        // base condition
        if(index >= arr.length){
            return max;
        }
        // processing logic
        if(arr[index] > max){
            max = arr[index];
        }
        // Recursive relation
       return getMax(arr,++index,max);
    }
}
