package Algo.LinkedList.SingleLL;

public class PlainLL {
    static class Node {
        int data;
        Node next;

        public Node() {
            this.data = 0;
            this.next = null;
        }

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    private static void printLL(Node firstNode) {
        Node temp = firstNode;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }

    public static void main(String[] args) {
        // initialization with first constructor
        Node firstNode = new Node();
        Node secondNode = new Node();
        Node thirdNode = new Node();
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        printLL(firstNode);
        System.out.println();
        // initialization with parameterized constructor
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        first.next = second;
        second.next = third;
        third.next = fourth;
        printLL(first);


    }
}

