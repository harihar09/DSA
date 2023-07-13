package Recursion;

import java.util.ArrayList;
import java.util.List;

public class AllIndexOfTarget {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 3, 3, 4, 5, 1};
        int target = 1;
        List<Integer> list = new ArrayList<>();
        List<Integer> ans = getAllIndex(arr, target, 0, list);
        System.out.println("all index of target " + ans);
    }

    private static List<Integer> getAllIndex(int[] arr, int target, int index, List<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return getAllIndex(arr,target,++index,list);
    }
}
