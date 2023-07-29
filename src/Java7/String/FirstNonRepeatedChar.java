package Java7.String;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String str = "abcdeacdeb";
        // we can use linked hash map to preserve the insertion order
        // if the frequency of char is equal to 1 then that will be
        // first non-repeated char in given string

        Map<Character, Integer> map = new LinkedHashMap<>();
        char[] arr = str.toCharArray();
        for (char ch : arr) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        System.out.println(map);
        boolean flag = false;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                flag = true;
                System.out.println("first non repeated char " + entry.getKey());
                break;
            }
        }
        if (!flag) {
            System.out.println("No non repeated char found");
        }
    }
}
