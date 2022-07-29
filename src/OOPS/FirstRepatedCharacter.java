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
        for (int i = 0; i < arr.length; i++) {

            if(set.contains(arr[i])) {
                System.out.println(arr[i]);
                break;
            }
            else
                set.add(arr[i]);
        }
    }
}