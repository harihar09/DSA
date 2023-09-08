package Algo.Array;

class A {
    static int a = 5;

    void print1() {
        System.out.println("parent : " + a);
    }
}

class B extends A {
    static int a = 10;

    void print1() {
        System.out.println("child : " + a);
    }
}

public class c {
    public static void main(String[] args) {
        A a = new B();
        System.out.println("a : " + a.a);//5
        a.a = 20;
        System.out.println("a : " + a.a);//20
        B b = new B();
        System.out.println("b :"+b.a); // 10

        A a1 = new B();
        System.out.println("a1 :"+a1.a);  // 20

        a.print1();  // 10
        b.print1();  // 10
        a1.print1();  // 10
    }
}
