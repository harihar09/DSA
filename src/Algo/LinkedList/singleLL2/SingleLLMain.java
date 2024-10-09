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

    // add data at the beginning
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
        // move tail to last node and update tail
        Node newNode = new Node(data);
        tail.next = newNode;
        tail = tail.next;
    }

    public void deleteHead() {
        // edge case - empty list
        if (isEmptyList()) {
            System.out.println("List is empty");
            return;
        }
        //non-empty list
        Node tempNode = head;
        head = head.next;
        tempNode.next = null;
    }

    public void deleteTail() {
        // edge case - empty list
        if (isEmptyList()) {
            System.out.println("list is empty");
            return;
        }
        // non-empty list - single node
        if (head.next == null) {
            head = null;
            return;
        }
        // non-empty list - more than one node
        Node lastNode = head.next;
        Node secondLastNode = head;
        while (lastNode.next != null) {
            // update lastNode and secondLastNode
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        // shift tail to secondLastNode
        tail = secondLastNode;
        tail.next = null;

    }

    private boolean isEmptyList() {
        return head == null;
    }

    private void createNode(int data) {
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
        singleLL.deleteHead();
        singleLL.printLL();
        singleLL.deleteTail();
        singleLL.deleteTail();
        singleLL.printLL();

    }
}
