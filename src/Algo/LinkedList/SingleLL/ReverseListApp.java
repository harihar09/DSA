package Algo.LinkedList.SingleLL;

public class ReverseListApp {
    public static void main(String[] args) {
        ReverseList reverseList = new ReverseList();
        reverseList.add(10);
        reverseList.traverse();
        reverseList.add(20);
        reverseList.traverse();
        reverseList.reverse();
        reverseList.traverse();
    }
}
