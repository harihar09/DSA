package Algo.LinkedList.DoublyLL;

public class DoublyLListApp {
    private DoublyLListNode head;
    private DoublyLListNode tail;

    //insertAtHead
    private void insertAtHead(int data) {
        // create a new node
        DoublyLListNode node = new DoublyLListNode(data);
        // empty list
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        // normal flow
        // assign node.next to head and head.pre to node and update the head
        node.next = head;
        head.prev = node;
        head = node;
    }

    //insert at tail
    private void insertAtTail(int data) {
        //new node
        DoublyLListNode node = new DoublyLListNode(data);
        //empty check
        if (head == null) {
            //assign head and tail to new node and return
            head = node;
            tail = node;
            return;
        }
        //normal flow - assign tail.next to new node and node.prev to tail and update the tail
        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    //insert at given position
    private void insertAtPosition(int data, int position) {
        // new node
        DoublyLListNode node = new DoublyLListNode(data);
        //empty check
        if (head == null) {
            // assign head and tail to node and return
            head = node;
            tail = node;
            return;
        }
        // corner cases
        if (position == 1) {
            insertAtHead(data);
            return;
        }
        if (position == listLength()) {
            insertAtTail(data);
            return;
        }
        //normal flow - find out pre and curr
        int index = 1;
        position = position - 1;
        DoublyLListNode preNode = head;
        while (index < position) {
            preNode = preNode.next;
            index++;
        }
        DoublyLListNode currNode = preNode.next;
        preNode.next = node;
        node.prev = preNode;
        currNode.prev = node;
        node.next = currNode;
    }

    //delete at head
    private void deleteAtHead() {
        //empty check
        if (head == null) {
            System.out.println("list is empty..");
            return;
        }
        // single node
        if (head.next == null) {
            head = null;
            tail = null;
            return;
        }
        //normal flow - update the head and adjust the pointers
        head = head.next;
        head.prev.next = null;
        head.prev = null;
    }

    //delete at tail
    private void deleteAtTail() {
        //empty check
        if (head == null) {
            System.out.println("list is empty..");
            return;
        }
        //corner case - single node
        if (head.next == null) {
            head = null;
            tail = null;
            return;
        }
        //normal flow - update the tail and pointers
        tail = tail.prev;
        tail.next.prev = null;
        tail.next = null;
    }

    //delete at given index
    private void deleteAtIndex(int index) {
        //empty check
        if (head.next == null) {
            System.out.println("list is empty..");
            return;
        }
        if (index <= 0 || index > listLength()) {
            System.out.println("invalid index");
            return;
        }
        //corner case : first and last index
        if (index == 1) {
            deleteAtHead();
        } else if (index == listLength()) {
            deleteAtTail();
        } else {
            // find out pre,curr node and repoint the pointers
            int temp = 1;
            index = index - 1;
            DoublyLListNode prevNode = head;
            while (temp < index) {
                prevNode = prevNode.next;
                temp++;
            }
            DoublyLListNode currNode = prevNode.next;
            prevNode.next = currNode.next;
            currNode.prev = null;
            currNode.next.prev = prevNode;
            currNode.next = null;
        }
    }

    // get list length
    private int listLength() {
        DoublyLListNode temp = head;
        int len = 0;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        return len;
    }


    //print list data
    private void print() {
        // empty check
        if (head == null) {
            System.out.println("list is empty..");
            return;
        }
        DoublyLListNode tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.data + " ");
            tempNode = tempNode.next;
        }
    }

    public static void main(String[] args) {
        DoublyLListApp list = new DoublyLListApp();
        list.print();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.insertAtTail(40);
        list.insertAtTail(60);
        list.print();
        System.out.println();
        list.insertAtPosition(100, 2);
        list.print();
        System.out.println();
      /*  list.deleteAtHead();
        list.deleteAtHead();
        list.print();
        System.out.println();
        list.deleteAtTail();
        list.deleteAtTail();
        list.print();
        System.out.println();
        list.deleteAtTail();
        list.print();
        System.out.println();*/
        list.deleteAtIndex(4);
        list.print();
    }
}
