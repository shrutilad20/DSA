/*
 * Problem: Maximum sum of non-adjacent elements (House Robber / Stickler Thief)
 *
 * You are given an array of integers `arr[]` representing the amount of money at each house. 
 * You cannot rob two adjacent houses. Find the maximum money you can rob without alerting the police.
 *
 * Example:
 * Input: arr = [5, 5, 10, 100, 10, 5]
 * Output: 110
 * Explanation: Rob houses with money 5, 100, and 5 → Total = 110
 *
 * Links:
 * - LeetCode (House Robber): https://leetcode.com/problems/house-robber/
 * - GeeksforGeeks (Stickler Thief): https://practice.geeksforgeeks.org/problems/stickler-theif-1587115621/1
 */

import java.util.Arrays;

class Solution {
    static int[] dp;

    // Function to calculate max sum without adjacent elements
    public int findMaxSum(int arr[]) {
        int n = arr.length;
        dp = new int[n];
        Arrays.fill(dp, -1); // initialize memoization array
        return loot(0, arr);
    }

    // Recursive function with memoization
    private int loot(int i, int[] arr) {
        if (i >= arr.length) return 0;
        if (dp[i] != -1) return dp[i];

        int pick = arr[i] + loot(i + 2, arr); // pick current → skip next
        int skip = loot(i + 1, arr);          // skip current
        dp[i] = Math.max(pick, skip);

        return dp[i];
    }

    // Simple main function for local testing
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] arr1 = {5, 5, 10, 100, 10, 5};
        int[] arr2 = {3, 2, 7, 10};
        int[] arr3 = {3, 2, 5, 10, 7};

        System.out.println(sol.findMaxSum(arr1)); // Expected: 110
        System.out.println(sol.findMaxSum(arr2)); // Expected: 13
        System.out.println(sol.findMaxSum(arr3)); // Expected: 15
    }
}
