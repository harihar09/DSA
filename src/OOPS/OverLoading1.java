package OOPS;

public class OverLoading1 {
    public static void main(String[] args) {
        OverLoading1 obj = new OverLoading1();
       // obj.m1(null);
    }
    public void m1(Integer i){
        System.out.println("integer");
    }
    public void m1(String s){
        System.out.println("string");
    }
}
