package Java7.String;

import java.util.Scanner;

public class frstAndLstOcranceOfChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.next();
        char [] arr = str.toCharArray();
        System.out.println("Enter character");
        char ch = sc.next().charAt(0);
        boolean flag = true;
        int firstIndex=0,lastIndex=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ch && flag){
                  firstIndex = i;
                  flag= false;
            }
            if(arr[i]==ch){
                lastIndex=i;
            }
        }
        if(flag)
            System.out.println(ch+" is not present in string "+str);
        System.out.println("firstIndex "+firstIndex+" lastIndex "+lastIndex);
    }
}
