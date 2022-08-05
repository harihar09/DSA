package Algo.Stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStringUsingStack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s = sc.next();
        Stack<Character> stack = new Stack<Character>();
        for(char c: s.toCharArray()){
            stack.push(c);
        }
        for(char c: s.toCharArray()){
           char ch= stack.pop();
            System.out.print(ch);
        }
    }
}
