package CP.LeetCode.String;

import java.util.Scanner;

public class FinalValueofVariableAfterPerformingOperations_2011 {
    public static void main(String[] args) {
        String [] arr = {"--X","X++","X++"};
        int count=0;
        String x = "X++";
        String y = "++X";
        int ans =0;
        for(String  string : arr){
             ans = ((string.equals(x)) || (string.equals(y))) ? (count = count + 1) : (count = count - 1);

        }
        System.out.println(ans);
    }
}
