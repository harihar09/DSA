package Java7.Array;

import java.util.Scanner;

public class ArraySize {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt();;
        int[] arr = new int[n];

        for(int i=0;i<n-1;i++){
            System.out.print(i+" ");
        }

    }
}
