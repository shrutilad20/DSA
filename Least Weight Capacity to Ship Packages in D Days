# 🚢 Least Weight Capacity to Ship Packages in D Days

[![Java](https://img.shields.io/badge/Language-Java-orange?style=flat-square)](https://www.java.com/)  
[![Difficulty](https://img.shields.io/badge/Difficulty-Medium-blue?style=flat-square)](https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/)

---

## 📖 Problem Statement

Given an array of package weights and an integer `d` representing days, find the **minimum ship capacity** needed to ship all packages **in order** within `d` days.  

**Constraints:**  
- Packages must be shipped in the given order.  
- Ship cannot carry more than its capacity each day.  

---

## 🔹 Example

```java
Input: weights = [3,2,2,4,1,4], days = 3
Output: 6
Explanation:
Day 1: 3, 2
Day 2: 2, 4
Day 3: 1, 4
💡 Approach: Binary Search on Answer
Step 1: Determine Search Space

Minimum capacity (lo) = maximum weight in array.

Maximum capacity (hi) = sum of all weights.

Step 2: Binary Search Logic

mid = (lo + hi) / 2 → try this capacity.

Check how many days it takes using days(mid, arr).

If days(mid) <= d → capacity works, try smaller (hi = mid - 1).

Else → capacity too small, try larger (lo = mid + 1).

Step 3: Calculate Days for Capacity
Initialize: days = 0, remaining_capacity = capacity
For each package:
    If remaining_capacity >= weight:
        remaining_capacity -= weight
    Else:
        days++
        remaining_capacity = capacity - weight
After loop, days++
Return total days

📊 Dry Run Example

Input: [3,2,2,4,1,4], days = 3

Day	Capacity Remaining	Packages Loaded
1	6 → 3	3,2
2	6 → 0	2,4
3	6 → 1	1,4

Minimum capacity = 6 ✅

🧩 Complexity Analysis

Time Complexity: O(n * log(sum(arr)))

Space Complexity: O(1)

💻 Java Implementation
class Solution {
    static int leastWeightCapacity(int[] arr, int n, int d) {
        int max = Integer.MIN_VALUE, sum = 0;
        for (int ele : arr) {
            max = Math.max(max, ele);
            sum += ele;
        }

        int lo = max, hi = sum, ans = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (days(mid, arr) <= d) {
                hi = mid - 1;
                ans = mid;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }

    static int days(int capacity, int[] arr) {
        int days = 0;
        int c = capacity;
        for (int ele : arr) {
            if (c >= ele) c -= ele;
            else {
                days++;
                c = capacity - ele;
            }
        }
        days++;
        return days;
    }
}

🔗 References

[LeetCode - Ship Packages](https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/ "LeetCode Problem")

[GeeksforGeeks](https://www.geeksforgeeks.org/problems/capacity-to-ship-packages-within-d-days/1)

🎯 Tags

#Java #BinarySearch #Arrays #LeetCode #GFG #Algorithm
