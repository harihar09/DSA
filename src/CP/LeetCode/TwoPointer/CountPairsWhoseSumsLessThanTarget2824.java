package CP.LeetCode.TwoPointer;

import java.util.Arrays;

public class CountPairsWhoseSumsLessThanTarget2824 {
    public static void main(String[] args) {
        /*Given a 0-indexed integer array nums of length n and an integer target,
        return the number of pairs (i, j) where 0 <= i < j < n and nums[i] + nums[j] < target.
        Input: nums = [-1,1,2,3,1], target = 2
        Output: 3   */
        int[] nums = {-1, 1, 2, 3, 1};
        int target = 2;
        int start = 0, end = (nums.length) - 1, count = 0, sum = 0;
        Arrays.sort(nums);
        while (start < end) {
            sum = nums[start] + nums[end];
            if (sum < target) {
                count = count + (end - start); // if the sum is less than target then it means
                // sum will be less only from start to less than end range
                start++;
            } else {
                end--;
            }
        }
        System.out.println("count " + count);
    }
}
