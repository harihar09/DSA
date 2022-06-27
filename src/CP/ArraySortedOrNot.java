package CP;

import java.util.Scanner;

public class ArraySortedOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " numbers");
        for (int i = 0; i <size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(isSorted(arr));

    }
    private static boolean isSorted(int[] arr){
        for(int i=1;i<arr.length;i++)
            if(arr[i]<arr[i-1])
                return false;
        return true;
    }
}
