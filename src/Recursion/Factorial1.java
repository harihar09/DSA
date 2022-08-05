package Recursion;

import java.util.Scanner;

public class Factorial1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        System.out.println(fact(n));

    }
    public static  int fact(int n){
        if(n==1)
            return 1;
        //int nextFact = fact(n-1);
       // int ans = n*nextFact;
        return n*fact(n-1);
    }
}
