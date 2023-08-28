package CP.LeetCode.TwoPointer;

import java.util.Arrays;

public class LagstPostvIntThatExistsWithItsNegtv2441 {
    public static void main(String[] args) {
        /*Given an integer array nums that does not contain any zeros, find the largest positive
        integer k such that -k also exists in the array.
        Return the positive integer k. If there is no such integer, return -1.

        Input: nums = [-1,2,-3,3,5]
        Output: 3
        Explanation: 3 is the only valid k we can find in the array.  */
        int[] nums = {-1, 2, -3, 3,5};
        System.out.println(findMaxK(nums));
    }

    public static int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int i = 0, j = nums.length - 1;
        while (i < j) {
            if (nums[i] + nums[j] == 0) {
                return nums[j];
            }
            if (nums[i] + nums[j] > 0) {
                j--;
            } else {
                i++;
            }
        }
        return -1;
    }
}
