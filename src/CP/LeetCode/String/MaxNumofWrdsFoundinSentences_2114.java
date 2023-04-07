package CP.LeetCode.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaxNumofWrdsFoundinSentences_2114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String string = sc.nextLine();
        int count = 0;
        for(char ch : string.toCharArray()){
            if(ch==' ')
                count++;
        }
        System.out.println("No of words are "+(count+1));
    }
}
