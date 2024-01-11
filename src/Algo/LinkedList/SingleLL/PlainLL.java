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


    private static void printLL(Node firstNode){
        Node temp = firstNode;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

    }
    public static void main(String[] args) {
        Node firstNode = new Node();
        Node secondNode = new Node();
        Node thirdNode = new Node();

        firstNode.next = secondNode;
        secondNode.next = thirdNode;

        printLL(firstNode);

    }
}

