package Patterns;
import java.util.Scanner;

    /*                              1 2 3 4 *
                                    1 2 3 * *
                                    1 2 * * *
            *                       1 * * * *
          * *
        * * *
      * * * *
    * * * * *  */
public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j<=n+1; j++) {
                if(j>=n+1-i)
                System.out.print("*"+" ");
                else
                    System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
