package Algo.LinkedList.SingleLL;

import java.util.List;

public class ReverseLL {
    private static  SingleListNode head;
    private static  SingleListNode tail;

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

    // reverse list using iterative
    private SingleListNode reverseUsingIterative() {
        //empty check
        if (head == null) {
            System.out.println("list is empty..");
            return head;
        }
        // corner case - single node
        if (head.next == null) {
            return head;
        }
        // normal flow - find out pre, curr nodes and update the pointers
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
        //update the head
        head.next = null;
        head = preNode;
        return head;
    }

    //reverse list using recursion
    private SingleListNode reverseUsingRecursion(SingleListNode prevNode, SingleListNode currNode) {
        // base case
        if (currNode == null) {
            return prevNode;
        }
        // next node
        SingleListNode nextNode = currNode.next;
        //reverse list
        currNode.next = prevNode;
        //recursive relation
        return reverseUsingRecursion(currNode, nextNode);
    }

    // print list data
    private void print(SingleListNode head) {
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
        list.print(head);
        System.out.println();
        list.reverseUsingIterative();
        list.print(head);
        SingleListNode prevNode = null;
        SingleListNode currNode = head;
        System.out.println();
        SingleListNode head = list.reverseUsingRecursion(null,currNode);
        list.print(head);
        System.out.println();
        SingleListNode head1 = list.reverseUsingRecursion(null,head);
        list.print(head1);
        System.out.println();
        SingleListNode head2 = list.reverseUsingRecursion(null, head1);
        list.print(head2);
    }
}
