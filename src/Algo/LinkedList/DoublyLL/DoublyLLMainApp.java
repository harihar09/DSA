package Algo.LinkedList.DoublyLL;

import Algo.LinkedList.DoublyLL.DoublyLLApp;

public class DoublyLLMainApp {
    public static void main(String[] args) {
        DoublyLLApp doublyLL = new DoublyLLApp();
        doublyLL.insertAtHead(50);
        doublyLL.insertAtHead(40);
        doublyLL.insertAtHead(30);
        doublyLL.print();
        doublyLL.insertAtTail(10);
        doublyLL.insertAtTail(5);
        doublyLL.print();
        doublyLL.insertAtIndex(0,60);
        doublyLL.print();
        doublyLL.insertAtIndex(6,70);
        doublyLL.print();
        doublyLL.insertAtIndex(3,100);
        doublyLL.print();
        doublyLL.insertAtIndex(6,200);
        doublyLL.print();
        doublyLL.deleteFirstNode();
        doublyLL.print();
        doublyLL.deleteFirstNode();
        doublyLL.print();
        doublyLL.deleteLastNode();
        doublyLL.print();
        doublyLL.deleteLastNode();
        doublyLL.print();
        doublyLL.deleteAtIndex(0);
        doublyLL.print();
        doublyLL.deleteAtIndex(3);
        doublyLL.print();
        doublyLL.deleteAtIndex(1);
        doublyLL.print();
        doublyLL.deleteAtIndex(-1);
    }
}
