package CP.LeetCode.Array;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class unique_Number_of_Occurrences_1207 {

    public static void main(String[] args) {
        int [] arr = {1, 2, 2, 1, 1, 3};
        List<Integer> list = (List<Integer>) Arrays.stream(arr).boxed().collect(Collectors.toList());
        Map<Integer, Long> map = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);
        HashSet<Long> duplicateValues = new HashSet<>();
        boolean flag = Boolean.TRUE;
        for(Map.Entry<Integer,Long> entry  : map.entrySet()){
            Long val = entry.getValue();
            if(duplicateValues.contains(val)){
                flag = Boolean.FALSE;
                System.out.println("val "+val);
            }else {
                duplicateValues.add(val);
            }
        }
        System.out.println(duplicateValues);
        System.out.println(flag);
    }
}
