package Algo.LinkedList;

public class LLImplClass {
    Node head;
    class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
// insert node at the beginning
    public void insertAtStart(){
        if(head == null){
            Node newNode = new Node(10);
            head = newNode;
        }
    }
    public static void main(String[] args) {
        LLImplClass obj = new LLImplClass();
        obj.insertAtStart();
    }
}
