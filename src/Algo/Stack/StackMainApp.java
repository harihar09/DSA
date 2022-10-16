package Algo.Stack;

import java.util.List;
import java.util.Scanner;

public class StackMainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the stack\n");
        int size = sc.nextInt();
        StackArrayImpl stackArray = new StackArrayImpl(size);
        int option;

        do{
            System.out.println("1. Push");
            System.out.println("2. POP");
            System.out.println("3. Peek");
            System.out.println("4. Min");
            System.out.println("5. Max");
            System.out.println("6. Exit");
            System.out.println("===========");
            System.out.println("Enter any option\n");
             option = sc.nextInt();
            switch (option){
                case 1 :
                    System.out.println("Enter number ");
                    int number = sc.nextInt();
                    stackArray.push(number);
                    stackArray.print();
                    break;

                case 2 :
                     stackArray.pop();
                    stackArray.print();
                     break;

                case 3 :
                   stackArray.peek();
                    stackArray.print();
                   break;

                case 4 : stackArray.min();
                    stackArray.print();
                      break;

                case 5 : stackArray.max();
                    stackArray.print();
                       break;

                case 6 : System.exit(1);

                default:
                    System.out.println("Enter correct option (1 - 6)\n");
            }
        }while(option!=6);
    }
}
