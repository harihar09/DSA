package Algo.Array;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumbers {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,1,3,2,5,6,7,5};  // 1,2,3
        // traverse through each number, print it if it's already
        // present in ans else add it
        Set<Integer> ans = new HashSet<>();
        for(Integer num : nums){
            if(ans.contains(num)){
                System.out.print(num+",");
            }else{
                ans.add(num);
            }
        }
    }
}
