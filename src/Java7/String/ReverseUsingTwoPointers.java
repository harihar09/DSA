package Java7.String;

import java.util.Scanner;

public class ReverseUsingTwoPointers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s = sc.next();
        int i =0;
        int j = s.length()-1;
        char[] arr =s.toCharArray();
        while(i<j){
            char ch = arr[i];
            arr[i] =arr[j];
            arr[j] =ch;
            ++i;
            --j;
        }
        System.out.println("Reversed String "+new String(arr));
    }

}
