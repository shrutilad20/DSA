# Find the Winner of the Circular Game

This repository contains a solution to the **Find the Winner of the Circular Game** problem from LeetCode.

🔗 **Problem Link:** [LeetCode 1823 - Find the Winner of the Circular Game](https://leetcode.com/problems/find-the-winner-of-the-circular-game/)

---

## 📖 Problem Statement
There are `n` friends sitting in a circle and numbered from `1` to `n` in clockwise order.  
Every `k`-th friend will be eliminated until only one friend remains.  

Return the number of the friend who wins the game.

---

## 💡 Approach
- Use a **queue** to simulate the circular game.  
- Insert all `n` players (1 → n) into the queue.  
- While more than one player is left:
  1. Rotate the queue `k-1` times by moving the front player to the back.
  2. Remove the `k`-th player from the queue.  
- The last remaining player in the queue is the winner.

---

## 💻 Code (Java)

```java
import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            q.add(i);
        }

        while (q.size() > 1) {
            // Move first k-1 players to the back
            for (int i = 1; i < k; i++) {
                q.add(q.remove());
            }
            // Eliminate the k-th player
            q.remove();
        }

        return q.peek(); // Winner
    }
}
