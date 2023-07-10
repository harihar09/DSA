package Recursion;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String string = sc.nextLine();
        int start = 0;
        int end = string.length() - 1;
        int mid = 0;
        char [] ans = stringReverse(string.toCharArray(), start, end, mid);
        System.out.println(String.copyValueOf(ans));
    }

    private static char[] stringReverse(char[] toCharArray, int start, int end, int mid) {
        //base condition
        if (mid >= toCharArray.length / 2) {
            return toCharArray;
        }
        // processing
        char temp = toCharArray[start];
        toCharArray[start] = toCharArray[end];
        toCharArray[end] = temp;

        // recursive relation
        char reversed[] =  stringReverse(toCharArray, ++start, --end, ++mid);
        return reversed;
    }
}
