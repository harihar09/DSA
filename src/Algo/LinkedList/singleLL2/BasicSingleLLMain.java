package Algo.LinkedList.singleLL2;

public class BasicSingleLLMain {
    public static void printLL(Node firstNode) {
        // get the start of LL and print all the data
        Node tempNode = firstNode;
        // handle edge/corner case : zero nodes/empty list,one node, ....
        if (tempNode == null) {
            System.out.println("list is empty:");
            return;
        }
        // non-empty list, print data and move on to next node,repeat this till last node.
        while (tempNode != null) {
            System.out.print(tempNode.data + "->");
            tempNode = tempNode.next;
        }
        System.out.print("null");

    }

    public static void main(String[] args) {
        // create few nodes and points to each other manually.
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        //now print all the nodes data
        printLL(node1);
    }
}
