package Algo.LinkedList.SingleLL;

public class ReverseList {
   Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
            this.next = null;
        }
    }

    public  void add(int data){
       if(head == null){
           Node node = new Node(data);
           head = node;
           return;
       }
       Node node = new Node(data);
       node.next = head;
       head = node;
    }

    public void traverse(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node currentNode = head;
        while(currentNode!=null){
            System.out.print(currentNode.data+"->");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public Node reverse(){
        if(head == null){
            System.out.println("list is empty");
            return null;
        }
        if(head.next==null)
            return head;
        Node currentNode = head.next;
        Node previousNode = head;
        while(currentNode!=null){
            Node nextNode = currentNode.next;
            currentNode.next = previousNode;

            previousNode = currentNode;
            currentNode = nextNode;
        }
        head.next = null;
        head = previousNode;
        return head;
    }
}
