package Java7.NumberSystem;

import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {

        //8 - 1000
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        String rem="";
        String ans ="";
        while(n>1){
            rem = rem+n%2;
            n=n/2;
        }
        ans = rem+n;
        StringBuffer sb = new StringBuffer(ans.trim());
        System.out.println(sb.reverse());

    }
}
