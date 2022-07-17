package Java7.NumberSystem;

import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter binary number");
        int n = sc.nextInt();
        long num =0,sum=0,i=0;
        while(n>0){
          int rem = n%10;
          if(rem == 1)
              sum = (int) (sum+Math.pow(2,i));
          n=n/10;
          i++;
        }
        System.out.println(sum);
    }
}
