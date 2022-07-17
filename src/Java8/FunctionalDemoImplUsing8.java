package Java8;

public class FunctionalDemoImplUsing8 {
    public static void main(String[] args) {
        FunctionalDemo functionalDemo = (a,b)->a+b;
        int ans = functionalDemo.add(20,30);
        System.out.println(ans);
    }
}
