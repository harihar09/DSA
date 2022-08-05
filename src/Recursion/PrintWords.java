package Recursion;

import java.util.Scanner;

public class PrintWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        String [] arr = {"zero","one","two","three","four","five","six","seven","eight","nine","ten"};
       /* while(n>0){
            int rem = n%10;
          //  System.out.print(arr[rem]+" ");
            n = n/10;
        }*/
        printWords(n,arr);
    }
    public static void printWords(int n,String []arr){
        if(n<=0) {
            return;
        }
        printWords(n/10,arr);
        System.out.print(arr[n%10]+" ");
    }
}
