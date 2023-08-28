package Algo.Array;

import java.util.*;

public class DuplicateNumbers {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 1, 3, 2, 5, 6, 7, 5};  // 1,2,3
        // traverse through each number, print it if it's already
        // present in ans else add it
        System.out.println("duplicates using set ::");
        findDuplicatesUsingSet(nums);
        System.out.println("\nduplicates using map ::");
        findDuplicatesUsingMap(nums);
        System.out.println("\nduplicates using sorting ::");
        findDuplicatesUsingSorting(nums);
        System.out.println("\nduplicates using brute force  approach ::");
        findDuplicatesWithBruteForceApproach(nums);

    }

    private static void findDuplicatesWithBruteForceApproach(int[] nums) {
        // for each number -> compare with remaining numbers
        boolean flag = true; // used to print only first occurrence of duplicate number
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && flag) {
                    System.out.print(nums[i] + ",");
                    flag = false;  // to skip other duplicates
                } else {
                    flag = true;
                }
            }
        }
    }

    private static void findDuplicatesUsingSorting(int[] nums) {
        //sort the array in ascending order and compare two adjacent numbers for equality
        Arrays.sort(nums);
        boolean flag = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if ((nums[i] == nums[i + 1]) && flag) {
                System.out.print(nums[i] + ","); // just to print first duplicate and then set
                // restriction using flag
                flag = false;
            } else {
                flag = true;
            }
        }
    }

    private static void findDuplicatesUsingMap(int[] nums) {
        // loop through each num, print it if it's already present in the map
        // else add it as new entry in the map
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                System.out.print(num + ",");
            } else {
                map.put(num, 1);
            }
        }
    }

    private static void findDuplicatesUsingSet(int[] nums) {
        Set<Integer> ans = new HashSet<>();
        for (Integer num : nums) {
            if (ans.contains(num)) {  // will return true if it's already present
                System.out.print(num + ",");
            } else {
                ans.add(num);  //  new entry in set if it's not present i.e. unique number
            }
        }
    }
}
