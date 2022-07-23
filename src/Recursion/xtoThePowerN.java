package Recursion;

import java.util.Scanner;

public class xtoThePowerN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        System.out.println("Enter x");
        int x = sc.nextInt();
         xtoThePowerN(x,n-1);
    }
    private static void xtoThePowerN(int x,int n){
      /*  if(n==0){
            return;
        }

        x= x*x;
        xtoThePowerN(x,n-1);
*/
    }
}
