package Algo.LinkedList;

public class LinkedList {
    private Node head;
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addFirst(5);
        linkedList.addFirst(1);
        linkedList.addLast(25);
        linkedList.print();
        linkedList.removeFirst();
        linkedList.print();
        linkedList.removeFirst();
        linkedList.print();
        linkedList.removeFirst();
        linkedList.print();
        linkedList.removeLast();
        linkedList.print();
        linkedList.removeLast();
        linkedList.print();
        linkedList.addFirst(10);
        linkedList.print();
        linkedList.addLast(100);
        linkedList.print();
        linkedList.addFirst(5);
        linkedList.print();
        linkedList.removeLast();
        linkedList.print();
        linkedList.removeFirst();
        linkedList.print();
    }
    // add node at the beginning of linked list
    private void addFirst(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }
    // add node at last
    private void addLast(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            return;
        }
        // go to last node
        Node currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = node;
    }
    //removeFirst value from linked list
    private void removeFirst(){
        if(head == null){
            System.out.println("Linked List is Empty");
            return;
        }
        head = head.next;
    }
    // removeLast value from Linked list
    private void removeLast(){
        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }
        // single value/Node in linked list
        if(head.next == null){
            head = null;
            return;
        }
        Node secondNode = head;
        Node firstNode = head.next;
        while(firstNode.next != null){
            firstNode = firstNode.next;
            secondNode = secondNode.next;
        }
        secondNode.next = null;
    }
    // traverse linked list
    private void print(){
        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }
        //traverse linked list and print data
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data+"->");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");
    }
}
