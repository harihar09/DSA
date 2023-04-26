package Algo.LinkedList.DoublyLL;

public class DoublyLinkedList {
    Node head;
    class Node{
        Node pre;
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.pre= null;
            this.next = null;
        }
    }
    public void addLast(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            return;
        }

        Node currentNode = head;
        while(currentNode.next!=null){
            currentNode = currentNode.next;
        }
        currentNode.next=node;
        node.pre = currentNode;
    }
    public void addFirst(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            return;
        }
        node.next = head;
        head.pre = node;
        head = node;
    }
    public void removeFirst(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        head = head.next;
    }
    public void removeLast(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        if(head.next==null){
            head = head.next;
            return;
        }
        Node currentNode = head.next;
        Node previousNode = head;
        while (currentNode.next!=null){
            currentNode = currentNode.next;
            previousNode = previousNode.next;
        }
        previousNode.next=null;
        currentNode.pre = null;
    }
    public void print(){
        if(head ==null){
            System.out.println("list is empty");
            return;
        }
        Node currentNode = head;
        while(currentNode!=null){
            System.out.print(currentNode.data+"->");
            currentNode = currentNode.next;
        }
        System.out.print("null");
    }
}
