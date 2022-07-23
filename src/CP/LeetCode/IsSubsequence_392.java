package CP.LeetCode;

import java.util.Scanner;

public class IsSubsequence_392 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string s and t");
        String s = sc.next();
        String t = sc.next();

        int sLength = s.length();
        int k=0,index=0;
        boolean flag = true;
        while(sLength-- > 0){
            char c = s.charAt(k++);
                   if(t.indexOf(c,index)!= -1){
                    index = t.indexOf(c,index);
                    index=index+1;
                       System.out.println("index "+index);
                }else{
                       flag = false;
                       break;
                   }
        }
        if(flag)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
