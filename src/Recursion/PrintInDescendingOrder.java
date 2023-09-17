package Recursion;

import java.util.Scanner;

public class PrintInDescendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        print(n);
    }

    private static void print(int n) {
        // base condition
        if (n <= 0) {
            return;
        }
        // processing
        //printing in descending order
        System.out.print(n + ",");
        // recursive relation, i.g. RR
        print(n - 1);
        //printing in ascending order
        System.out.println(n);
    }
}
