package CP.LeetCode.HashMap;

import java.util.HashMap;
import java.util.Map;

public class TwoSum_Optimised {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int sum = 5;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<6;map.put(arr[i],i++)){
            if(map.containsKey(sum-arr[i])){
                System.out.println(map.get(sum-arr[i])+" "+i);
            }
        }
    }
}
