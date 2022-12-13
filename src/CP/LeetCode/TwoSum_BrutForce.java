package CP.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class TwoSum_BrutForce {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int sum = 7;
        for(int i=0;i<6;i++){
            for(int j=i+1;j<7;j++){
               if(arr[i]+arr[j]==sum){
                   System.out.println("{"+arr[i]+","+arr[j]+ "}");
               }
            }
        }
    }
}
