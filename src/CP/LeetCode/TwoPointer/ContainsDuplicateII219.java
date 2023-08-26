package CP.LeetCode.TwoPointer;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII219 {
    public static void main(String[] args) {
       /* Given an integer array nums and an integer k, return true if there are
        two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
        Input: nums = [1,2,3,1], k = 3
        Output: true */

        int[] nums = {1, 2, 3, 1};
        int k = 3;
        // brute force approach
        // start with first element and check with remaining and then second number with remaining
        // continue this process till we get ans

        // Optimised solution would be
        // traverse through array and keep track of number and index
        boolean ans = checkDuplicate(nums, k);

    }

    private static boolean checkDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (Math.abs(map.get(nums[i]) - i) <= k) {
                    return true;
                }
                map.put(nums[i], i);
            }
        }
        return false;
    }
}
