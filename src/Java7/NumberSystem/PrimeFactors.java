package Java7.NumberSystem;

import java.util.Scanner;
import java.util.Stack;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int i=2;
        Stack<Integer> stack = new Stack<>();
        while(n>1){
            while(n%i==0){
                n=n/i;
                stack.push(i);
            }
            i++;
        }
        System.out.println(stack);
    }
}
