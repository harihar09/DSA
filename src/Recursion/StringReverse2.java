package Recursion;

import java.util.Arrays;

public class StringReverse2 {
    public static void main(String[] args) {
        String str = "abcd";
        char[] ans = reverse(str.toCharArray(), 0);
        System.out.println(Arrays.toString(ans));

    }

    private static char[] reverse(char[] arr, int size) {
        // base condition
        if (size == (arr.length))
            return arr;
        char temp = arr[size];
        reverse(arr, ++size);
       // int count = arr.length - size;
        arr[arr.length-size] = temp;
        return arr;
    }
}
