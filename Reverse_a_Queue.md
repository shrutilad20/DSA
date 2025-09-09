# Reverse a Queue in Java

This repository contains a solution to the **Reverse a Queue** problem from GeeksforGeeks.

🔗 **Problem Link:** [Reverse a Queue - GFG](https://www.geeksforgeeks.org/problems/queue-reversal/1)

---

## 📖 Approach
1. Use a stack to temporarily hold the elements of the queue.
2. Push all elements from the queue into the stack.
3. Pop each element from the stack and insert it back into the queue.
4. The queue will now be reversed.

---

## 💻 Code (Java)

```java
import java.util.Queue;
import java.util.Stack;

class Solution {
    // Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();
        while (!q.isEmpty()) {
            st.push(q.remove());
        }
        while (!st.isEmpty()) {
            q.add(st.pop());
        }
        return q;
    }
}
