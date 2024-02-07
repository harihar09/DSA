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
        System.out.println();
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
        System.out.println("Length : " + length);
    }

    //prepend - add node to the beginning of the list
    public void prepend(int data) {
        //create new node
        Node node = new Node(data);
        //corner case - empty list
        if (head == null) {
            //point head and tail to new node
            //and reset the length to one
            head = node;
            tail = node;
            length = 1;
            return;
        }
        //normal case - point new node to head
        //and update the head and length
        node.next = head;
        head = node;
        length++;
    }

    //append - add node to end of list
    public void append(int data) {
        //create new node
        Node node = new Node(data);
        //corner case - empty list
        if (head == null || tail == null) {
            //assign head and tail to the node
            //reset the length to one
            head = node;
            tail = node;
            length = 1;
            return;
        }
        //normal case - add node at last and update the tail
        //update the length
        tail.next = node;
        tail = tail.next;
        length++;
    }

    //remove first
    public void removeFirst() {
        //corner case - empty list
        //length = 0, head || tail == null
        if (head == null || tail == null) {
            //print and return
            System.out.println("list is empty,nothing to remove");
            return;
        }
        //normal case - update the head
        Node tempNode = head;
        head = head.next;
        tempNode.next = null;
        length--;
    }

    //remove last
    public void removeLast() {
        //corner case - empty list
        if (length == 0) {
            System.out.println("list is empty,nothing to remove");
            return;
        }
        //single node - update head and tail
        //and reset the length to zero
        if (head.next == null) {
            head = null;
            tail = null;
            length = 0;
            return;
        }
        //more than one node
        //find out second last node
        Node secondLastNode = head;
        Node last = head.next;
        while (last.next != null) {
            //update the last and secondLastNode
            secondLastNode = last;
            last = last.next;
        }
        //remove the last node and update the tail,length
        secondLastNode.next = null;
        tail = secondLastNode;
        length--;
    }
}
