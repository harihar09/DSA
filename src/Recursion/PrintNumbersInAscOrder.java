package Recursion;

import java.util.Scanner;

public class PrintNumbersInAscOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        printNumsInDescOrder(num);
    }

    private static void printNumsInDescOrder(int num) {
        if(num<0){                        // base condition
            return;
        }
        printNumsInDescOrder(num-1);     // recursive call
        System.out.println(num);      //processing
    }
}
