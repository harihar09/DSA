package Algo.LinkedList.SingleLL.ScottBarrett.course;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(10);
        //print the list
       /* list.print();
        //print head,tail and length of the
        list.getHead();
        list.getTail();
        list.getLength();*/
        //test prepend function
        list.prepend(5);
        list.print();
        list.prepend(2);
        list.print();
    }
}
