# Reverse First K Elements of a Queue

This repository contains a solution to the **Reverse First K Elements of a Queue** problem from GeeksforGeeks.

🔗 **Problem Link:** [Reverse First K elements of Queue - GFG](https://www.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue/1)

---

## 📖 Problem Statement
Given a queue of integers and an integer `K`, the task is to reverse the order of the first `K` elements of the queue, leaving the other elements in the same relative order.

---

## 💡 Approach
1. If the queue is empty, null, or `k <= 0`, return the queue unchanged.  
2. If `k > queue size`, return the queue unchanged (to avoid invalid operations).  
3. Push the first `K` elements into a stack.  
4. Pop all elements from the stack and add them back to the queue → this reverses the first `K`.  
5. Finally, move the remaining `(n - k)` elements to the back of the queue to preserve order.

---

## 💻 Code (Java)

```java
import java.util.Queue;
import java.util.Stack;

class Solution {
    // Function to reverse first K elements of a Queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        if (q == null || q.isEmpty() || k <= 0) {
            return q;
        }

        if (k > q.size()) {
            return q;
        }

        Stack<Integer> st = new Stack<>();

        // Step 1: Push first K elements into stack
        for (int i = 0; i < k; i++) {
            st.push(q.remove());
        }

        // Step 2: Enqueue back the stack elements
        while (!st.isEmpty()) {
            q.add(st.pop());
        }

        // Step 3: Move remaining elements (n - k) to the back of queue
        int size = q.size() - k;
        for (int i = 0; i < size; i++) {
            q.add(q.remove());
        }

        return q;
    }
}
