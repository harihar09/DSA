package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ReduceDemo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        int sum = list.stream().mapToInt(i -> i).reduce(0, (a, b) -> a + b);
        System.out.println(sum);
        int max = list.stream().mapToInt(i->i).reduce(Integer::max).getAsInt();
        System.out.println(max);
        int min = list.stream().mapToInt(i->i).reduce(Integer::min).getAsInt();
        System.out.println(min);
        int max2= list.stream().mapToInt(i->i).max().getAsInt();
        System.out.println("max2 "+max2);
      int Secondmax= list.stream().sorted(Comparator.reverseOrder())
              .mapToInt(i->i).skip(1).max().getAsInt();
       System.out.println("Secondmax "+Secondmax);


 }
}
