package Algo.LinkedList.singleLL2;

public class SingleLLMain {
    // add Node reference here
    Node head;
    Node tail;

    // print the LL
    public void printLL() {
        // edge/corner case : empty list
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        // non-empty list
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    // add data in the beginning
    public void addAtHead(int data) {
        // check edge/corner case : empty list
        // for empty or non-empty, we need to create new node
        // point new node.next to first node/head
        //update the head : point it to new node

        // empty list
        if (isEmptyList()) {
            createNode(data);
            return;
        }
        // non-empty list
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addAtTail(int data) {
        // edge case : empty list
        // create newNode and point head and tail to newNode and return.
        if (isEmptyList()) {
            createNode(data);
            return;
        }
        //non-empty list
        // move tail to last node
        Node newNode = new Node(data);
        tail.next = newNode;
        tail = tail.next;
    }

    public boolean isEmptyList() {
        return head == null;
    }

    public void createNode(int data) {
        Node newNode = new Node(data);
        head = newNode;
        tail = newNode;
    }


    public static void main(String[] args) {
        SingleLLMain singleLL = new SingleLLMain();
        singleLL.printLL();
        singleLL.addAtHead(3);
        singleLL.addAtHead(2);
        singleLL.addAtHead(1);
        singleLL.printLL();
        singleLL.addAtHead(1);
        singleLL.printLL();
        singleLL.addAtTail(2);
        singleLL.addAtTail(3);
        singleLL.printLL();
        singleLL.addAtHead(4);
        singleLL.printLL();

    }
}
