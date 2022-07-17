package Java8.Supplier;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierImpl /*implements Supplier<String> */{
   /* @Override
    public String get() {
        return "hello";
    }*/

    public static void main(String[] args) {
        /*Supplier<String> supplier = new SupplierImpl();
        System.out.println(supplier.get());*/
        Supplier<String> supplier = () -> "hello";
        System.out.println(supplier.get());
        Supplier<String> getOtp  = () -> {
            String val = "";
            for (int i = 0; i < 4; i++) {
                val = val + new Random().nextInt(10);
            }
            return val;
        };
        System.out.println(getOtp.get());
        List<String> list = Arrays.asList();
        System.out.println(list.stream().findAny().orElseGet(getOtp));
    }
}
