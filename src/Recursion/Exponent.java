package Recursion;

import java.util.Scanner;

public class Exponent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        double n = sc.nextDouble();
        System.out.println(exponent(n));
    }

    private static int exponent(double n) {
        if(n==0)
            return 1;
        return 2*exponent(n-1);
    }
}
