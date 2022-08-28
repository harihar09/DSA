package Java7.NumberSystem;

import java.util.Scanner;

public class IsPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();;
        boolean flag = true;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                flag = false;
                System.out.println("not a prime number");
                break;
            }
        }
        if(flag)
            System.out.println("it's prime");

    }
}
