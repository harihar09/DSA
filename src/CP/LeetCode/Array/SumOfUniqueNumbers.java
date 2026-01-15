package CP.LeetCode.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SumOfUniqueNumbers {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2};
        Map<Integer, Integer> map = new HashMap<>();
        for(Integer num : arr){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        System.out.println(map);
        int sum = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                sum = sum + entry.getKey();
            }
        }
        System.out.println(sum);
    }
}
