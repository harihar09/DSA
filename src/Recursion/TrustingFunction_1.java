package Recursion;

import java.util.Scanner;

public class TrustingFunction_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        System.out.println("printing N to 1");
        printNto1(n);   // n to 1
        System.out.println("printing 1 to N");
        print1toN(n);   //1 to n
        System.out.println("sum of 1 to n ");
        int sum=0,i=0;
        int ans = sumOf1toN(n);
        System.out.println(ans);
        System.out.println("factorial of n ");
        System.out.println(fact(n));
        System.out.println("sum of all digits");
        System.out.println("enter number");
        int number = sc.nextInt();
        System.out.println(sumOfDigits(number));
        System.out.println("pattern printing 1 to N");
        pattern(n);
        System.out.println("pattern printing N to 1");
        patternNto1(n);

    }

    private static void patternNto1(int n) {
        if(n<0)
            return;
        for(int i=1;i<n+1;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        patternNto1(n-1);
    }

    private static void pattern(int n) {
         if(n<0)
             return ;
        pattern(n-1);
        for(int i=1;i<n+1;i++){
            System.out.print(i+" ");
        }
        System.out.println();

    }

    private static int sumOfDigits(int n) {
        if(n<=1)
            return 1;
        return sumOfDigits(n/10)+n%10;
    }

    public static  void printNto1(int n){
        if(n<=0)
            return;
        System.out.println(n);
        printNto1(n-1);
    }
    public static  void print1toN(int n){
        if(n<=0)
            return;
        print1toN(n-1);
        System.out.println(n);
    }

    public static int sumOf1toN(int n){
        /*if(n<=1)
            return 1;
        sum+= sumOf1toN(n-1,0);
        return sum+=n;*/

        // 1 +2 +3 +...(n-1)+n
        if(n<=1)
            return 1;
       // int left_part= sumOf1toN(n-1);
     //  return left_part+n;
        return n+sumOf1toN(n-1);

    }

    public static int fact(int n){
        if(n<=1)
            return 1;
       /* int left = fact(n-1);
        return left * n;*/

        return n*fact(n-1);
    }
}
