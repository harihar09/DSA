package Algo.LinkedList.SingleLL;

public class SinglyLL {
    SingleListNode head = null;
    SingleListNode tail = null;

    private void printLL() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        SingleListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // insert new node at the beginning
    private void insertAtHead(int data) {
        // create a new node
        // point new node to head
        // repoint head
        SingleListNode node = new SingleListNode(data);
        // ll is empty
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        node.next = head;
        head = node;
    }

    private void insertAtTail(int data) {
        // create a new node
        SingleListNode node = new SingleListNode(data);
        // if ll is empty
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        // repoint tail next to new node and update the tail
        tail.next = node;
        tail = node;
    }

    private void insertAtPosition(int data, int position) {
        SingleListNode node = new SingleListNode(data);
        // LL is empty
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        // position <= 1, insert at head
        if (position <= 1) {
            insertAtHead(data);
            return;
        }
        int len = listLength();
        if (position > len) {
            insertAtTail(data);
            return;
        }
        int index = 1;
        SingleListNode temp = head;
        position = position - 1;
        while (index < position) {
            temp = temp.next;
            index++;
        }
        node.next = temp.next;
        temp.next = node;
    }

    private int listLength() {
        int len = 0;
        SingleListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        return len;
    }

    private void deleteAtHead() {
        // empty check
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        SingleListNode temp = head;
        head = head.next;
        temp.next = null;
    }

    private void deleteAtTail() {
        //empty check
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        // go till second last number
        SingleListNode temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        //update and delete last number
        tail = temp;
        temp.next = null;
    }

    private void deleteAtPosition(int position) {
        // invalid position
        if (position <= 0 || position > listLength()) {
            System.out.println("invalid position");
            return;
        }
        // corner cases : head and tail
        if (position == 1) {
            deleteAtHead();
            return;
        }
        if (position == listLength()) {
            deleteAtTail();
            return;
        }
        //normal flow
        // go till node one before position
        SingleListNode prev = head;
        int index = 1;
        position = position - 1;
        while (index < position) {
            prev = prev.next;
            index++;
        }
        //repoint prev next
        SingleListNode curr = prev.next;
        prev.next = curr.next;
        curr.next = null;
    }

    public static void main(String[] args) {

        SinglyLL LL = new SinglyLL();
        LL.printLL();
        LL.insertAtTail(10);
        LL.insertAtHead(20);
        LL.insertAtHead(30);
        LL.insertAtHead(40);
        LL.insertAtTail(60);
        LL.insertAtHead(50);
        LL.insertAtPosition(100, 3);
        LL.printLL();
        System.out.println();
        LL.deleteAtHead();
        LL.printLL();
        System.out.println();
        LL.deleteAtTail();
        LL.deleteAtTail();
        LL.printLL();
        System.out.println("\nDelete at position");
        LL.deleteAtPosition(3);
        LL.printLL();
    }
}

