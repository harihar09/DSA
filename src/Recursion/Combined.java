package Recursion;

import java.util.Scanner;

public class Combined {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        System.out.println("Print 1 to n....");
        int i=1;
        print(i,n);
        System.out.println("\nPrint n to 1..");
        print(n);
        System.out.println("\nFactorial of "+n+" is "+factorial(n));
        System.out.println(fibonacci(n)+" is the "+n+"th term in fibonacci series");

    }
    public static  void print(int i,int n){
        if(i>=n){
            System.out.print(i);
            return;
        }
        System.out.print(i+" ");
        print(++i,n);
    }
    public static void print(int n){
        if(n<=0){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        print(n-1);
    }
    public static int factorial(int n){
        if(n<=0)
            return 1;
        return n*factorial(n-1);
    }

    public static  int fibonacci(int n){
        if(n==0 || n==1)
            return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
