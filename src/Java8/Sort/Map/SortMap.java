package Java8.Sort.Map;

import java.util.*;

public class SortMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("five",5);
        map.put("two",2);
        map.put("three",3);
        map.put("one",1);
        map.put("four",4);
        System.out.println(map);
        //convert map to list
        List<Map.Entry<String,Integer>> entryList = new ArrayList<>(map.entrySet());
        /*Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getKey().compareTo(o1.getKey());
            }
        });*/
      //  Collections.sort(entryList,(entry1, entry2)->entry2.getKey().compareTo(entry1.getKey()));
        entryList.stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
      //  System.out.println(entryList);
    }
}
