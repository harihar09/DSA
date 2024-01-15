package Algo.LinkedList.SingleLL;

public class ArrayToLinkedList {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    private Node convertToLinkedList(int[] arr) {
        // first node
        Node head = new Node(arr[0]);
        Node tempNode = head;

        for (int i = 1; i < arr.length; i++) {
            // new node
            Node newNode = new Node(arr[i]);
            //assign temp.next to new node
            tempNode.next = newNode;
            //mode tempNode
            tempNode = tempNode.next;
        }
        return head;
    }

    private void printList(Node head) {
        Node tempNode = head;
        while (tempNode.next != null) {
            System.out.print(tempNode.data + "->");
            tempNode = tempNode.next;
        }
        System.out.print(tempNode.data);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        ArrayToLinkedList obj = new ArrayToLinkedList();
        Node head = obj.convertToLinkedList(arr);
        obj.printList(head);
    }


}
