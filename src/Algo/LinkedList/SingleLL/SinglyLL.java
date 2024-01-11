package Algo.LinkedList.SingleLL;

public class SinglyLL {
    SinglyNode head = null;
    SinglyNode tail = null;

    private void printLL() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        SinglyNode temp = head;
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
        SinglyNode node = new SinglyNode(data);
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
        SinglyNode node = new SinglyNode(data);
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
        SinglyNode node = new SinglyNode(data);
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
        int len = getLength();
        if (position > len) {
            insertAtTail(data);
            return;
        }
        int index = 1;
        SinglyNode temp = head;
        position = position-1;
        while (index < position) {
            temp = temp.next;
            index++;
        }
        node.next = temp.next;
        temp.next = node;
    }

    private int getLength() {
        int len = 0;
        SinglyNode temp = head;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        return len;
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

    }
}

