package Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        n-=2;
        int a=0,b=1;
        System.out.print(a+" "+b+" ");
        fibo(n,a,b);

    }

    private static void fibo(int n,int a,int b) {
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.print(c+" ");
        fibo(n-1,b,c);
    }
}
