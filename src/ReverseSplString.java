import java.util.Arrays;
import java.util.Scanner;

public class ReverseSplString {
    public static void main(String[] args) {
        // Reverse each word in string, keep . , and space as it is.
        // i/p -  my,name.is john  o/p - ym.eman.si nhoj

        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();
        for (char ch : str.toCharArray()) {
            // if ch = , or . or space then reverse the word and append . or , or space
            // else append to word
            if(ch=='.' || ch==',' || ch==' '){
                result.append(reverse(String.valueOf(word)));
                result.append(ch);
                word.setLength(0);
            }else{
                word.append(ch);
            }
        }
        result.append(reverse(String.valueOf(word)));
        System.out.println("result - " + result);
    }

    private static String reverse(String word) {
        char[] arr = word.toCharArray();
        int left = 0, right = arr.length - 1;
        while (left < right) {
            char tempChar = arr[left];
            arr[left] = arr[right];
            arr[right] = tempChar;
            left++;
            right--;
        }
        return new String(arr);
    }
}
