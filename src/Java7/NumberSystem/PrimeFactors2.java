package Java7.NumberSystem;

import java.util.Scanner;

public class PrimeFactors2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int i=2;
        while(n>1){
            while(n%i==0){
                System.out.print(i+" ");
                n/=i;
            }
            i++;
        }
        System.out.println("i "+i);

    }
}
