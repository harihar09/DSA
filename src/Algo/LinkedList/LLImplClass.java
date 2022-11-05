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
    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
            newNode.next = head;
            head = newNode;
    }
    // Insert Node at last
    public void insertAtLast(int data){
        Node node = new Node(data);
        if(head==null){
            head = node;
            return;
        }
        Node currentNode = head;
        while(currentNode.next!=null){
            currentNode = currentNode.next;
        }
        currentNode.next = node;
    }
    //Remove first node
    public void removeFirstNode(){
        if(head == null)
            return;
        head = head.next;
    }
    //Remove last node
    public void removeLastNode(){
        if( head == null || head.next == null)
            head = null;
        Node currentNode = head;
        Node nextNode = head.next;
        while(nextNode.next!=null){
            nextNode = nextNode.next;
            currentNode = currentNode.next;
        }
        currentNode.next = null;
    }
    // print linked list data
    public void printLL(){

        if(head!=null){
            Node currentNode =head;
            while(currentNode!=null){
                System.out.print(currentNode.data+"->");
                currentNode = currentNode.next;
            }
            System.out.println("NULL");
        }
    }
    public static void main(String[] args) {
        LLImplClass obj = new LLImplClass();
        obj.insertAtStart(10);
        obj.insertAtStart(20);
        obj.insertAtStart(30);
        obj.insertAtStart(100);
        obj.insertAtLast(200);
        obj.insertAtLast(300);
        obj.printLL();
        obj.removeFirstNode();
        obj.removeLastNode();

        obj.printLL();
    }
}
