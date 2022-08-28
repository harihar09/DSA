package Recursion;

public class Recursion1 {
    public static void main(String[] args) {
        printMessgae();
        System.out.println("2nd call");
       // printMessgae();
    }
    public static  void printMessgae(){
        System.out.println("hello");
        System.out.println("before");
        printMessgae2();
        System.out.println("after ");


    }
    public static  void printMessgae2(){
        System.out.println("hello");
    }
}
