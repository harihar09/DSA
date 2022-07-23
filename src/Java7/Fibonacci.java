package Java7;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        n-=2;
        int a=0,b=1,c=0;
        System.out.print(a+" "+b+" ");
        while(n-- >0){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}
