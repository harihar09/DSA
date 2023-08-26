package CP.LeetCode.TwoPointer;

import java.util.Arrays;

public class ReverseWordsInAStringII_186 {
    public static void main(String[] args) {
    /*    Given a character array s, reverse the order of the words.
       A word is defined as a sequence of non-space characters. The words in s will be
        separated by a single space.
       Your code must solve the problem in-place, i.e. without allocating extra space.

        Input: s = ["t","h","e"," ","s","k","y"," ","i","s"," ","b","l","u","e"]
        Output: ["b","l","u","e"," ","i","s"," ","s","k","y"," ","t","h","e"]  */
        char[] s = {'t', 'h', 'e', ' ', 's', 'k', 'y', ' ', 'i', 's', ' ', 'b', 'l', 'u', 'e'};

        reverseWords(s);
    }

    private static void reverseWords(char[] s) {
        // reverse whole char array
        reverse(s, 0, s.length - 1);
        //reverse each word in char array based on white space
        int start = 0;
        for (int i = 0; i < s.length - 1; i++) {
            if (s[i] == ' ') {
                reverse(s, start, i - 1);
                start = i + 1; //reset start to new
            }
        }
        reverse(s, start, s.length - 1); // for last word if any
        System.out.println("reversed " + Arrays.toString(s));
    }

    private static void reverse(char[] s, int start, int end) {
        while (start < end) {
            char temp = s[start];
            s[start++] = s[end];
            s[end--] = temp;
        }
    }
}
