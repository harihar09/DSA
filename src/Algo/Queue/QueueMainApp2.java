package Algo.Queue;

import java.util.Scanner;

public class QueueMainApp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter queue size");
        int size = sc.nextInt();
        // create the queue obj and initialize the size,front,rear and queue
        QueueImpl2 queue = new QueueImpl2(size);
        int choice;
        do {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Front");
            System.out.println("4. Print");
            System.out.println("5. Size");
            System.out.println("6. Exit\n");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter number");
                    int data = sc.nextInt();
                    queue.push(data);
                    break;
                case 2:
                    queue.pop();
                    break;
                case 3:
                    queue.front();
                    break;
                case 4:
                    queue.print();
                    break;
                case 5:
                    queue.size();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter correct option");
                    break;
            }
        } while (choice != 6);
    }
}
