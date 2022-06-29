package Patterns;
import java.util.Date;
import java.util.Scanner;
    /*      *
          * *
        * * *
      * * * *
    * * * * *  */
public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        long startTime = System.currentTimeMillis();
        //o(n2)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j<n; j++) {
                if(j>=n-1-i)
                System.out.print("*"+" ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("endTime "+endTime);
        System.out.println("total time taken "+((endTime-startTime)/1000));

        System.out.println("++++++++++++++++++");
        // o(n3)
       /* long startTime = System.currentTimeMillis();
        System.out.println("startTime "+startTime);
        Date d1 = new Date();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                System.out.print(" "+" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        Date d2 = new Date();
        long endTime = System.currentTimeMillis();
        System.out.println("endTime "+endTime);
        System.out.println("total time taken "+((endTime-startTime)/1000));*/
    }
}
