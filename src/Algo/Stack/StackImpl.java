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
            System.out.println(stack[top--]+" is removed from stack");
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
    public void min(){
        if(!isUnderflow()) {
            int min = stack[top];
            for (int i = top - 1; i >= 0; i--) {
                if (stack[i] < min) {
                    min = stack[i];
                }
            }
            System.out.println("min "+min);
        }
        else
            System.out.println("Stack is empty");
    }
    public void max(){
        if(!isUnderflow()) {
            int max = stack[top];
            for (int i = top - 1; i >= 0; i--) {
                if (stack[i] > max) {
                    max = stack[i];
                }
            }
            System.out.println("Max "+max);
        }
        System.out.println("Stack is empty");
    }
    public void print(){
        if(!isUnderflow()) {
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + "-> ");
            }
            System.out.println();
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

        int option;
        do{
            System.out.println("1. Push()");
            System.out.println("2. Pop()");
            System.out.println("3. Peek()");
            System.out.println("4. Print()");
            System.out.println("5. Min()");
            System.out.println("6. Max()");
            System.out.println("7. Exit");
            System.out.println("Enter above any one option");
             option = sc.nextInt();
            switch(option){

                case 1 : System.out.println("Enter number");
                          int item = sc.nextInt();
                          stack.push(item);
                          break;
                case 2 : stack.pop();
                         break;
                case 3 : stack.peek();
                         break;
                case 4 : stack.print();
                         break;
                case 5: stack.min();
                        break;
                case 6 :stack.max();
                         break;
                case 7 : System.exit(0);
                default :
                    System.out.println("enter correct option 1- 7 ");
            }
        }while(option!=6);

    }
}
