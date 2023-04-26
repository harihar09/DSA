package Algo.LinkedList.DoublyLL;

public class DoubleLinkedListApp {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.print();
        doublyLinkedList.addLast(10);
        doublyLinkedList.addLast(20);
        doublyLinkedList.addLast(30);
        doublyLinkedList.addLast(40);
        doublyLinkedList.addLast(50);
        doublyLinkedList.addLast(60);
        doublyLinkedList.print();
        System.out.println();
        doublyLinkedList.addFirst(100);
        doublyLinkedList.addFirst(200);
        doublyLinkedList.print();
        System.out.println();
        doublyLinkedList.removeFirst();
        doublyLinkedList.removeFirst();
        doublyLinkedList.removeLast();
        doublyLinkedList.removeLast();
        doublyLinkedList.removeLast();
        doublyLinkedList.print();
    }
}

