package CP.LeetCode.HashMap;

import java.nio.Buffer;
import java.util.*;
import java.util.stream.Collectors;

public class Sort_the_People_2418 {
    public static void main(String[] args) {
        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 190, 170};

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(names[i], heights[i]);
        }
        List<Map.Entry<String, Integer>> sorted = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toList());
        System.out.println(sorted);
        sorted.forEach(System.out::println);
        List<String > list = new ArrayList<>();
        for(Map.Entry entry :sorted){
            list.add((String) entry.getKey());
        }
        Collections.sort(list);
        System.out.println(list);
        list.toArray();

    }
}
