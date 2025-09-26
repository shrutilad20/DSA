# 🍌 Koko Eating Bananas

[![Java](https://img.shields.io/badge/Language-Java-orange?style=flat-square)](https://www.java.com/)  
[![Difficulty](https://img.shields.io/badge/Difficulty-Medium-blue?style=flat-square)](https://leetcode.com/problems/koko-eating-bananas/)

---

## 📖 Problem Statement

Koko loves to eat bananas. There are `n` piles of bananas, the `i-th` pile has `arr[i]` bananas.  
Koko can decide her **eating speed `k` bananas/hour**.  

- Each hour, she chooses a pile of bananas and eats `k` bananas from it.  
- If the pile has less than `k` bananas, she eats all bananas in that pile and moves to the next hour.  

Given `h` hours, find the **minimum integer `k`** such that she can eat all the bananas within `h` hours.

---

## 🔹 Example

```java
Input: piles = [3,6,7,11], h = 8
Output: 4
Explanation:
- Hour 1: eat 3 from pile 1
- Hour 2: eat 4 from pile 2 (2 remain)
- Hour 3: eat 2 from pile 2
- Hour 4: eat 4 from pile 3 (3 remain)
- Hour 5: eat 3 from pile 3
- Hour 6: eat 4 from pile 4 (7 remain)
- Hour 7: eat 4 from pile 4 (3 remain)
- Hour 8: eat 3 from pile 4
Minimum speed = 4
💡 Approach: Binary Search on Eating Speed
Search space:

lo = 1 (minimum possible speed)

hi = max(arr) (she cannot eat more than the largest pile per hour)

Binary Search:

mid = (lo + hi) / 2 → try this speed

Compute hours needed using hours(mid, arr)

If hours <= h → possible speed, try smaller (hi = mid - 1)

Else → increase speed (lo = mid + 1)

Return the minimum valid speed.

Helper Function hours
Computes total hours needed at a given speed:

text
Copy code
For each pile:
    hours += ceil(pile / speed)
Return hours
Ceiling division can be done using (pile + speed - 1) / speed

🧩 Complexity
Time Complexity: O(n * log(max(arr)))

Space Complexity: O(1)

💻 Java Code
java
Copy code
class Solution {
    public int kokoEat(int[] arr, int h) {
        int lo = 1;
        int speed = 0;
        int max = Integer.MIN_VALUE;

        for (int ele : arr) {
            max = Math.max(max, ele);
        }
        int hi = max;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (h >= hours(mid, arr)) {
                hi = mid - 1;
                speed = mid;
            } else {
                lo = mid + 1;
            }
        }

        return speed;
    }

    private int hours(int speed, int[] arr) {
        int h = 0;
        for (int ele : arr) {
            h += (ele + speed - 1) / speed; // ceil division
        }
        return h;
    }
}
🔗 References
LeetCode - Koko Eating Bananas

GeeksforGeeks - Koko Eating Bananas

🎯 Tags
#Java #BinarySearch #Arrays #LeetCode #GFG #Algorithm
