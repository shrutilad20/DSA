# 🎯 LeetCode Problem: Remove Element

---

## 🔍 Problem Description

Given an integer array `nums` and an integer `val`, your task is to **remove all occurrences** of `val` from `nums`, **in-place**, and return the number of elements left after removal.

📝 **Constraints**:
- Do **not** allocate extra space for another array.
- Modify the input array in-place with **O(1)** extra memory.

---

## 🧠 Intuition & Approach

We use a **two-pointer** method:

- One pointer `i` iterates over the array.
- Another pointer `k` tracks the index where the next valid element should go.

If `nums[i] != val`, we copy `nums[i]` to `nums[k]` and move both forward.

This ensures that only values not equal to `val` are kept, and they are moved to the beginning of the array.

---
# 🔢 Missing Number

[Link to the Problem → LeetCode - 27](https://leetcode.com/problems/remove-element/)

[Link to the Problem → Neet code](https://neetcode.io/problems/remove-element)

## 💡 Java Code

```java
class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) { 
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}

🧪 Example
Input:
nums = [0,1,2,2,3,0,4,2]
val = 2
Output:

New length = 5
Modified array = [0,1,4,0,3] (only first 5 elements matter)
✅ The first 5 elements are the values that are not equal to val.
⏱️ Complexity Analysis
Time Complexity: O(n)
Each element is visited once.

Space Complexity: O(1)
No extra memory is used; the changes are made in-place.

✅ Notes
The order of remaining elements can be changed.

Everything beyond the returned length is not important.

Efficient for memory-constrained environments due to in-place manipulation.