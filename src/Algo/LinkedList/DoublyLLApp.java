package Algo.LinkedList;

public class DoublyLLApp {
    DoublyLLNode head;
    int linkedListLength = 0;

    private void insertAtHead(int data){
        //create new node
        DoublyLLNode  newNode = new DoublyLLNode(data);
        linkedListLength++;
        //check if LL is empty,if yes make new node as LL head and return
        if(head == null){
            head = newNode;
            return;
        }
        //point new node.next to head and head.pre to new node and
        //make new node as head
        newNode.next = head;
        head.pre = newNode;
        head = newNode;
    }
    private void insertAtTail(int data){
        //create a new node
        DoublyLLNode newNode = new DoublyLLNode(data);
        linkedListLength++;
        // check if Linked list empty, if yes then make new node as head
        // and return
        if(head == null){
            head = newNode;
            return;
        }
        // traverse through linked list till last node
        // and point last node next to new node and new node pre to last node
        DoublyLLNode tempNode = head;
        while(tempNode.next != null){
            tempNode = tempNode.next;
        }
        newNode.pre = tempNode;
        tempNode.next = newNode;
    }
    private void insertAtIndex(int index, int data){
        //if the index is 0 then insertAtHead
        if(index == 0){
            insertAtHead(data);
            return;
        }
        //if the index is of linked list size then insertAtTail
        if(index == linkedListLength){
            insertAtTail(data);
            return;
        }
        //create new node
        DoublyLLNode newNode = new DoublyLLNode(data);
        linkedListLength++;
        //traverse through linked list till given index
        DoublyLLNode lastNode = head;
        DoublyLLNode secondLastNode = head.next;
        while(--index > 0){
            secondLastNode = secondLastNode.next;
            lastNode = lastNode.next;
        }
        newNode.next = secondLastNode;
        secondLastNode.pre =newNode;
        lastNode.next = newNode;
        newNode.pre = lastNode;
    }
    private void deleteFirstNode(){
        if(head == null){
            System.out.println("Linked list empty");
            return;
        }
        head = head.next;
        linkedListLength--;
    }
    private void deleteLastNode(){
        if(head == null){
            System.out.println("linked list is empty");
            return;
        }
        DoublyLLNode lastNode = head;
        while(lastNode.next != null){
            lastNode = lastNode.next;
        }
        lastNode.pre.next = null;
        lastNode.pre = null;
        linkedListLength--;
    }
    private void deleteAtIndex(int index){
        if(index < 0 || index > linkedListLength-1){
            int size = linkedListLength-1;
            System.out.println("enter index between "+"0 "+size);
            return;
        }
        if(head == null){
            System.out.println("linked list is empty");
            return;
        }
        if(index == 0){
            deleteFirstNode();
            return;
        }
        if(index == linkedListLength-1){
            deleteLastNode();
            return;
        }
        DoublyLLNode tempNode = head;
        while(--index > 0){
            tempNode = tempNode.next;
        }
        tempNode.next.next.pre = tempNode;
        tempNode.next = tempNode.next.next;
        linkedListLength--;
    }
    private void print(){
        DoublyLLNode tempNode = head;
        while(tempNode != null){
            System.out.print(tempNode.data+"->");
            tempNode = tempNode.next;
        }
        System.out.println("NULL");
        System.out.println("length "+linkedListLength);
    }
    public static void main(String[] args) {
        DoublyLLApp doublyLL = new DoublyLLApp();
        doublyLL.insertAtHead(50);
        doublyLL.insertAtHead(40);
        doublyLL.insertAtHead(30);
        doublyLL.print();
        doublyLL.insertAtTail(10);
        doublyLL.insertAtTail(5);
        doublyLL.print();
        doublyLL.insertAtIndex(0,60);
        doublyLL.print();
        doublyLL.insertAtIndex(6,70);
        doublyLL.print();
        doublyLL.insertAtIndex(3,100);
        doublyLL.print();
        doublyLL.insertAtIndex(6,200);
        doublyLL.print();
        doublyLL.deleteFirstNode();
        doublyLL.print();
        doublyLL.deleteFirstNode();
        doublyLL.print();
        doublyLL.deleteLastNode();
        doublyLL.print();
        doublyLL.deleteLastNode();
        doublyLL.print();
        doublyLL.deleteAtIndex(0);
        doublyLL.print();
        doublyLL.deleteAtIndex(3);
        doublyLL.print();
        doublyLL.deleteAtIndex(1);
        doublyLL.print();
        doublyLL.deleteAtIndex(-1);
    }
}
