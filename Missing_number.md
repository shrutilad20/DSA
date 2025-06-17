# 🔢 Missing Number - LeetCode Problem

## 📝 Problem Statement

Given an array `nums` containing `n` distinct numbers in the range `[0, n]`, return the only number in the range that is **missing** from the array.

### 📌 Constraints:
- `n == nums.length`
- `0 <= nums[i] <= n`
- All the numbers of `nums` are **unique**

---

## ✅ Example

### Input:
```java
nums = [0, 1]

# 🔢 Missing Number

[Link to the Problem → LeetCode #268](https://leetcode.com/problems/missing-number/)
 [Geeks For Geeks] (https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1)
---
### Code

class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;   
        int exnums=n * (n+1) / 2;
            int acnums=0;
         
            for(int num:nums){
                acnums= acnums+ num;
        
            }                      
                  return exnums - acnums;
        }
        }


 🕒 Time & Space Complexity
Time Complexity: O(n)

Space Complexity: O(1) (no extra space used)

🔁 Alternative Solutions
XOR Method: Use XOR of all indices and array elements to find the missing number.

Sorting: Sort and check the index vs value mismatch (less efficient: O(n log n)).

Hashing/Set: Use a HashSet to track presence (uses extra space: O(n)).

