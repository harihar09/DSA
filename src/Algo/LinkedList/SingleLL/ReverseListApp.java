package Algo.LinkedList.SingleLL;


import java.util.logging.Logger;

public class ReverseListApp {
    static Logger logger = Logger.getLogger(String.valueOf(ReverseListApp.class));
    public static void main(String[] args) {
        logger.info("inside main method.");
        ReverseList reverseList = new ReverseList();
        reverseList.add(10);
        reverseList.traverse();
        reverseList.add(20);
        reverseList.traverse();
        reverseList.reverse();
        reverseList.traverse();
    }
}
