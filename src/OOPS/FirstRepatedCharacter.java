package OOPS;

import javax.security.sasl.SaslClient;
import java.util.*;
import java.util.stream.Stream;

public class FirstRepatedCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.next();
        HashSet<Character> set = new HashSet<>();
        boolean flag = false;
        int index = 0;
        char[] arr = str.toCharArray();
        for (char c : arr) {

            if (set.contains(c)) {
                System.out.println(c);
                break;
            } else
                set.add(c);
        }
    }
}