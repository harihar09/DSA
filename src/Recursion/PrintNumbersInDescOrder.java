package Recursion;

import java.util.Scanner;

public class PrintNumbersInDescOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        printNumsInDescOrder(num);
    }

    private static void printNumsInDescOrder(int num) {
        if(num<=1){                        // base condition
            System.out.println(num);
            return;
        }
        System.out.println(num);      //processing
        printNumsInDescOrder(num-1);     // recursive call
    }
}
