package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountOccourance {
    public static void main(String[] args) {

        String s = "INDIAISMYCOUNTRY";

       long count =  s.chars().filter(c->c=='I').count();
        System.out.println(count);

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        List<Integer> list2 = list.stream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println(list2);
    }
}

