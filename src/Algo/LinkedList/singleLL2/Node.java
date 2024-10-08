package Algo.LinkedList.singleLL2;

public class Node {
    // Node contains data and address of another node.
    int data;
    /*    next variable just hold the reference of another node
        type object and not the actual content of the object.*/
    Node next;

    // parameterized constructor
    public Node(int data) {
        this.data = data;
        this.next = null; // node will be created with given data and
        // node variable holds null value.
    }
}
