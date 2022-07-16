package Java7.String;

import java.lang.reflect.Method;

import static java.lang.Class.forName;


public class StringClassMethods {
    public static void main(String[] args) throws ClassNotFoundException {
        Class  obj = Class.forName("java.lang.String");
        Method[] declaredMethods = obj.getDeclaredMethods();
        for(Method m : declaredMethods){
            System.out.println(m);
        }

    }
}
