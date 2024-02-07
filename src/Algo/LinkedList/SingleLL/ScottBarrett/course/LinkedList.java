package Algo.LinkedList.SingleLL.ScottBarrett.course;

import java.util.Optional;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    //Node class
    class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    //Linked list class constructor for first node
    public LinkedList(int data) {
        //create the first node with given value
        Node newNode = new Node(data);
        //head and tail should point to the new node.
        head = newNode;
        tail = newNode;
        length = 1;
    }

    //this will print the data
    public void print() {
        //corner case - empty list
        if (head == null) {
            System.out.println("list is empty..");
            return;
        }
        //normal case - iterate through list and print the data
        Node tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.data + " ");
            tempNode = tempNode.next;
        }
    }

    //print the head
    public void getHead() {
        //corner case - empty list
        if (head == null) {
            System.out.println("list is empty..");
            return;
        }
        System.out.println("Head : " + head.data);
    }

    //print the tail
    public void getTail() {
        //corner case - empty list
        if (head == null) {
            System.out.println("list is empty..");
            return;
        }
        System.out.println("Tail : " + head.data);
    }

    //print the length
    public void getLength() {
        //corner case - empty list
        if (head == null) {
            System.out.println("list is empty..");
            return;
        }
        System.out.println("Length : " + length);
    }
}
