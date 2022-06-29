package Patterns;
/* @ * * * *
   @ @ * * *
   @ @ @ * *
   @ @ @ @ *  */
        import java.util.Scanner;

public class Pattern4
{
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter number");
        int n = sc.nextInt();
        //o(n3)
     /*   for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("@"+" ");
            }
            for(int k=n;k>i;k--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }*/
        //o(n2)
        for(int i=0;i<n;i++){
            for(int j=0;j<=n;j++){
                if(j<=i)
                    System.out.print("@"+" ");
                else
                    System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
