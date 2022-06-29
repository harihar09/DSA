package Patterns;
    /*  *
        * *
        * * *
        * * * *
        * * *
        * *
        *      */
import java.util.Scanner;
public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        for(int i=0;i<=n/2;i++){
            for(int j=0;j<=n/2;j++){
                if(j<=i && i<=n/2){
                    System.out.print("*"+" ");
                }
            }
            System.out.println();
        }
        for(int i=0;i<n/2;i++){
            for(int j=0;j<n/2-i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
