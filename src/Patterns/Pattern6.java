package Patterns;

       /*       *
              *   *
            *   *   *
          *   *   *   *
        *   *   *   *   *
      *   *   *   *   *   *   */

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int p=0;
        int count=0;
        int q=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<2*n -1;j++){
                if(j==(n-i-1)+p){
                System.out.print("*"+" ");
                if(count<i)
                    p+=2;
                count++;
                }
                else {
                    System.out.print(" " + " ");
                }
            }
            p=0;
            count=0;
            System.out.println();

        }
    }
}
