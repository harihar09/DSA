package Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        int fact = 1;
        factorial(n,fact);
    }

    private static void factorial(int n, int fact) {
        if(n==0){
            System.out.println(fact);
            return;
        }
        fact*=n;
        factorial(n-1,fact);
    }
}
