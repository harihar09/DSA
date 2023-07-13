package Recursion;

public class PrintArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int index = 0;
        printArr(arr,index);
    }

    private static void printArr(int[] arr, int index) {
        // Base condition
        if(index>=arr.length)
            return;
        // processing
        // in ascending order
        System.out.println(arr[index]);
        // RR
        printArr(arr,++index);
        // print in reverse order
        System.out.println(arr[--index]);
    }
}
