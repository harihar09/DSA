package Java7.Collection.ArrayList;

import java.util.*;

public class addMethod {
    public static void main(String[] args) {

       List<Integer> list1 = Arrays.asList(1,1,2,2,3,4,5);
       List<Integer> list2 = new ArrayList<Integer>();
        Set<Character> set = new HashSet<>();
       for(Integer val : list1){
             if(!list2.contains(val))
                 list2.add(val);
       }
        System.out.println(list1);
        System.out.println(list2);

       String s = "firstRepeatedCharacter";
       for(char ch : s.toCharArray()){
           if(!set.add(ch)){
               System.out.println("First repeated Character is ->"+ch);
               break;
           }

       }

    }
}
