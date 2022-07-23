package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.next();
        int i=0;
        reverseStr(str.toCharArray(),i);
    }

    private static void reverseStr(char[] arr, int i) {
        if(i==((arr.length)/2)){
            System.out.println("reversed string ->"+ new String(arr));
            return;
        }
        char temp = arr[i];
        arr[i] = arr[arr.length-i-1];
        arr[arr.length-i-1] =temp;
        reverseStr(arr,++i);
    }
}
