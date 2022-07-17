package Java8;

public class FunctionalDemoImpl implements FunctionalDemo {

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        FunctionalDemo functionalDemo = new FunctionalDemoImpl();
        int ans = functionalDemo.add(10,20);
        System.out.println(ans);
    }
}
