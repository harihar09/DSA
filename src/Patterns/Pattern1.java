package Patterns;
    /*  *
        * *
        * * *
        * * * *  */

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j<=i; j++) {
               // if(i>=j)
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        System.out.println("============");
       /* * * * *
        * * *
        * *
        **/
        for (int i = 0; i < n; i++) {
            for (int j = n; j>i; j--) {
                // if(i>=j)
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }
}
