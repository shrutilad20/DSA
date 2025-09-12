/*
 * Problem: Min Cost Climbing Stairs
 *
 * You are given an integer array cost where cost[i] is the cost of the i-th step on a staircase. 
 * Once you pay the cost, you can either climb one or two steps.
 *
 * Return the minimum cost to reach the top of the floor.
 *
 * Example:
 * Input: cost = [10, 15, 20]
 * Output: 15
 * Explanation: Take step 1 (15) and climb two steps to reach the top.
 *
 * Links:
 * - LeetCode: https://leetcode.com/problems/min-cost-climbing-stairs/
 * - GeeksforGeeks: https://practice.geeksforgeeks.org/problems/min-cost-climbing-stairs/1
 */

import java.util.Arrays;

class Solution {
    static int[] dp;

    // Function to calculate minimum cost to reach the top of the stairs
    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        dp = new int[n];
        Arrays.fill(dp, -1);

        // Start either from step 0 or step 1
        return Math.min(mincost(0, cost), mincost(1, cost));
    }

    // Helper recursive function with memoization
    private static int mincost(int i, int[] cost) {
        if (i >= cost.length) return 0;
        if (dp[i] != -1) return dp[i];

        return dp[i] = cost[i] + Math.min(mincost(i + 1, cost), mincost(i + 2, cost));
    }

    // Simple main function to test locally
    public static void main(String[] args) {
        int[] cost1 = {10, 15, 20};
        int[] cost2 = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};

        System.out.println(minCostClimbingStairs(cost1)); // Expected: 15
        System.out.println(minCostClimbingStairs(cost2)); // Expected: 6
    }
}
