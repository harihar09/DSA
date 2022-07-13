package OOPS;

public class MainClass {

    public static void main(String[] args) {

        ParentClass p1 = new ChildClass();
        p1.m1();
       // p1.m2();

        ParentClass p2 = new ParentClass();
        p2.m1();
       //p2.m2();

      ChildClass C1 = new ChildClass();
       C1.m1();
       // C1.m2();

       // ChildClass c2 = new ParentClass();
    }
}
