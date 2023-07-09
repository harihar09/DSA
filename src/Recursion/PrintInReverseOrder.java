package Recursion;

import java.util.Scanner;

public class PrintInReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        tailRecursion(n);
    }

    private static void tailRecursion(int n) {
        // base condition
        if(n<1){
            return;
        }
        System.out.println(n);
        // recursive relation
        tailRecursion(n-1);
        System.out.println("returning from"+n);
    }
}
