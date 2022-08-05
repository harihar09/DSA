package Recursion;

import java.util.Scanner;

public class AscDescNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        ascNumbers(n);
    }

    public static void ascNumbers(int n){
        if(n<=0){
            return;
        }
        System.out.println("before recursive call");
        System.out.println(n);
        ascNumbers(n-1);
        System.out.println("after recursive call");
        System.out.println(n);
    }
}
