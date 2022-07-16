package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveBlank {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("cat","dog","rat and cat","    ","","hen");
        List<String> list2 = list.stream().filter(s ->!s.isEmpty()).map(s->s.replaceAll("\\s","")).filter(s->!s.isEmpty()).collect(Collectors.toList());
        System.out.println(list2);

    }
}
