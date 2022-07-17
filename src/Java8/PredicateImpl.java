package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateImpl /*implements Predicate<Integer>*/ {
    public static void main(String[] args) {

     /*   int[] arr = {1,2,3,4,5,6,7,8};

        List<Integer> list = new ArrayList<>();
        for(int i : arr){
            list.add(i);
        }
        List<Integer> collect = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);*/

       // Predicate<Integer> predicate = new PredicateImpl();
      //  System.out.println("Even ->"+predicate.test(11));
        Predicate<Integer> predicate = integer -> integer%2==0;
       // System.out.println(predicate.test(10));
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
        list.stream().filter(predicate).forEach(integer -> System.out.println(integer));
    }

   /* @Override
    public boolean test(Integer integer) {       //Approach - 1
        return integer%2==0;
    }*/

}
