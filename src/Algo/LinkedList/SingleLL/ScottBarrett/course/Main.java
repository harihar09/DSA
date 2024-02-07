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
        list.getLength();
        list.prepend(2);
        list.print();
        list.getLength();
        list.append(20);
        list.append(25);
        list.print();
        list.getLength();
        list.removeFirst();
        list.removeFirst();
        list.print();
        list.getLength();
        list.removeLast();
        list.removeLast();
        list.print();
        list.getLength();
        list.removeLast();
        list.print();
        list.getLength();

    }
}
