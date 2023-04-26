package Algo.LinkedList.SingleLL;

public class TestLinkedList {
    static Node head;
    public static void main(String[] args) {
        TestLinkedList linkedList = new TestLinkedList();
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        node1.next = node2;
        node2.next = node3;
        //print(node1);
        Node newNode = new Node(10);
        Node head1 = insertAtHead(newNode,20);
        Node head2 = insertAtHead(head1,30);
        Node head3 = insertAtHead(head2,40);
        print(head3);
        insertAtTail(100);
        insertAtTail(200);
        print(head);
        insertAtIndex(2,500);
        print(head);
        insertAtIndex(1,300);
        print(head);
        insertAtIndex(4,400);
        print(head);

    }
    private static  void insertAtIndex(int index,int data){
        //create newNode
        Node newNode = new Node(data);
        // check if linked list is empty or first index
        if( head == null){
            head = newNode;
            return;
        }
        // insert at first position
        if(index == 0){
            newNode.next = head;
            head = newNode;
            return;
        }
        //traverse till given index
        Node tempNode = head;
        if(index > 0) {
            while (--index > 0) {
                tempNode = tempNode.next;
            }
            newNode.next = tempNode.next;
            tempNode.next = newNode;
        }
    }
    private static  void insertAtTail(int data){
        //create new node
        Node newNode = new Node(data);
        //check if linkedList is empty,if yes then make newNode
        // as head and return
        if(head == null){
            head = newNode;
            return;
        }
        //traverse linkedList till last node
        Node tempNode = head;
        while(tempNode.next != null){
            tempNode = tempNode.next;
        }
        tempNode.next = newNode;
    }
    private static Node insertAtHead(Node head,int data){
        // create new node
        Node newNode = new Node(data);
        // point the newNode to head
        newNode.next = head;
        // make the newNode as head
        head = newNode;
        return  head;
    }
    public static void print(Node head){
        while(head!=null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("NULL");
    }
}
