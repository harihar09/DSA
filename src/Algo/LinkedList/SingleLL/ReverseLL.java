package Algo.LinkedList.SingleLL;

public class ReverseLL {
    private SingleListNode head;
    private SingleListNode tail;

    // insert at tail
    private void insertAtTail(int data) {
        // new node
        SingleListNode node = new SingleListNode(data);
        //empty check
        if (head == null) {
            // assign head and tail to new node
            head = node;
            tail = node;
            return;
        }
        // normal flow
        tail.next = node;
        tail = node;
    }

    // reverse list
    private SingleListNode reverse() {
        //empty check
        if (head == null) {
            System.out.println("list is empty..");
            return head;
        }
        // corner case - single node
        if (head.next == null) {
            return head;
        }
        // normal flow - find out pre and curr and update the pointers
        SingleListNode preNode = head;
        SingleListNode currNode = head.next;
        while (currNode != null) {
            // store the pointer for future reference or to not lose the list
            SingleListNode nextNode = currNode.next;
            //reverse the list
            currNode.next = preNode;
            //update the pointers
            preNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = preNode;
        return head;
    }

    // print list data
    private void print() {
        //empty check
        if (head == null) {
            System.out.println("list is empty..");
            return;
        }
        SingleListNode tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.data + " ");
            tempNode = tempNode.next;
        }
    }

    public static void main(String[] args) {
        ReverseLL list = new ReverseLL();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.print();
        System.out.println();
        list.reverse();
        list.print();
    }
}
