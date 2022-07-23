package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      //  System.out.println("Enter string");
       // String str = sc.next();
        List<String> list = Arrays.asList("abcd","mark","tom");
      // long count =  str.chars().filter(ch->ch=='a').count();
      //  System.out.println(count);
      List<String> sorted= list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());/*;.filter(string ->string.contains("a"))
                .map(str1->str1.chars().filter(ch->ch=='a')).count();
        System.out.println("count "+count);*/
        System.out.println(sorted);
        List<String> l=sorted.stream().filter(string ->string.contains("a")).collect(Collectors.toList());
        System.out.println(l);
        long count = l.stream().map(string -> string.chars().filter(ch -> ch == 'a')).count();
        System.out.println("a "+count);
    }

    }
