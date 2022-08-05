package Algo.Stack;

import java.util.Scanner;
import java.util.Stack;

public class RemoveMiddle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=1;i<=n;i++){
            stack.push(i);
        }
        System.out.println(stack);
        System.out.println(stack.size());
        int middle = 1+(stack.size()-1)/2;
        int size = stack.size();
        int count=0;
        Stack<Integer> stack1 = new Stack<Integer>();
        while(size-- >middle){
            stack1.push(stack.pop());
            count++;
        }

        int removeMiddle = stack.pop();
        System.out.println(removeMiddle);
        System.out.println("count "+count);
        while(count-- >0){
            stack.push(stack1.pop());
        }
        System.out.println(stack);
    }
}
