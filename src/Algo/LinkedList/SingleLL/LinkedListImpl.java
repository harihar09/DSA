package Algo.LinkedList.SingleLL;

public class LinkedListImpl {
    Node head;
    int size;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    public void addFirst(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }

    public void print(){
        if(head == null){
            System.out.println("Empty list");
            return;
        }
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
        System.out.println("List Size ->"+size);
    }

    public void addLast(int data){
        if(isEmpty()){
            System.out.println("Empty list");
            return;
        }
        Node node = new Node(data);
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = node;
    }

    public void deleteFirst(){
        if(isEmpty()){
            System.out.println("Empty list");
            return;
        }
        head = head.next;
        size--;
    }
    public void deleteLast(){
        if(isEmpty()){
            System.out.println("Empty list");
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLastNode = head;
        Node lastNode = head.next;
        while(lastNode.next!=null){
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next =null;
    }
    public void reverseList(){
        if(head == null || head.next == null){
            return;
        }
        Node preNode = head;
        Node currNode = head.next;
        while(currNode!=null){
            Node nextNode = currNode.next;
            currNode.next = preNode;
            //update
            preNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = preNode;
    }
    public boolean isEmpty(){
      return  (head==null)?true:false;
    }

    public static void main(String[] args) {
        LinkedListImpl linkedList = new LinkedListImpl();
        linkedList.addFirst(10);
        linkedList.addFirst(20);
        linkedList.addLast(30);
        linkedList.addFirst(5);
        linkedList.print();
      //  linkedList.deleteFirst();
       // linkedList.addLast(40);
        //linkedList.deleteFirst();
        linkedList.reverseList();
        linkedList.print();
    }
}
