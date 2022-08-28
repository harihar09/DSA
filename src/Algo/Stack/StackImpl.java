package Algo.Stack;

import java.util.Scanner;
import java.util.SortedMap;

public class StackImpl {
    private int size;
    private int top;
    int[] stack;
    public StackImpl(int size){
        this.size = size;
        stack = new int[size];
        top=-1;
    }
    public void push(int item){
        if(!isOverflow())
        stack[++top] = item;
        else
            System.out.println("Stack is full");
    }
    public void pop(){
        if(!isUnderflow())
        --top;
        else
            System.out.println("Stack is empty");
    }
    public int peek(){
        if(!isUnderflow())
        return stack[top];
        else
            System.out.println("Stack is empty");
        return -1;
    }
    public int min(){
        if(!isUnderflow()) {
            int min = stack[top];
            for (int i = top - 1; i >= 0; i--) {
                if (stack[i] < min) {
                    min = stack[i];
                }
            }
            return min;
        }
        else
            System.out.println("Stack is empty");
        return  -1;
    }
    public int max(){
        if(!isUnderflow()) {
            int max = stack[top];
            for (int i = top - 1; i >= 0; i--) {
                if (stack[i] > max) {
                    max = stack[i];
                }
            }
            return max;
        }
        return -1;
    }
    public void print(){
        if(!isUnderflow()) {
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
        }else
            System.out.println("Stack is empty");
    }
    public boolean isOverflow(){
        return (top == size-1);
    }
    public boolean isUnderflow(){
        return (top == -1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter stack size");
        int size = sc.nextInt();
        StackImpl stack = new StackImpl(size);
        stack.print();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.print();
        stack.pop();
        System.out.println();
        stack.print();
        System.out.println();
        System.out.println(stack.peek());
        System.out.println(stack.max());
        System.out.println(stack.min());

    }
}
