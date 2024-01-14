package Algo.LinkedList.SingleLL;

public class Middle {
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

    // middle of linked list
    private SingleListNode getMiddle() {
        //empty check
        if (head == null) {
            System.out.println("list is empty..");
            return head;
        }
        //corner case - single node
        if (head.next == null) {
            return head;
        }
        //normal flow - use tortoise logic
        SingleListNode slow = head;
        SingleListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
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
         Middle middle = new Middle();
         middle.insertAtTail(10);
         middle.insertAtTail(20);
         middle.insertAtTail(30);
         middle.insertAtTail(40);
         middle.insertAtTail(50);
         middle.insertAtTail(60);
         middle.insertAtTail(70);
        SingleListNode middleNode = middle.getMiddle();
        System.out.println(middleNode.data);
    }
}
