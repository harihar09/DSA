package Java7.String;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedChar {
    public static void main(String[] args) {
        String str = "abcd";
        // we can use hashset to store chars
        char[] arr = str.toCharArray();
        Set<Character> set = new HashSet<>();
        boolean flag = false;
        for(char ch : arr){
            if(!set.contains(ch)){
                set.add(ch);
            }else {
                System.out.println(ch);
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("no repeated character found");
        }
    }
}
