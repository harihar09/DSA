package Recursion;

import java.util.Scanner;

public class SumOfNnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
       sumOfNumbers(n,0);
        int sum = 0;
        //System.out.println("sum is "+sum);
    }
    private static void sumOfNumbers(int n,int sum){

        if(n==0) {
            System.out.println(sum);
            return ;
        }
         sum+= n;
        sumOfNumbers(n-1,sum);
       // System.out.println(sum);
    }
}
