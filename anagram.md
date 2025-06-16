# 🔄 Anagram Checker in Java

This project provides a simple Java program to check whether two given strings are **anagrams** of each other.

An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, using all original letters exactly once.

---

## 📌 Problem Statement

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

### 🔗 Problem Link:
[Valid Anagram – LeetCode](https://leetcode.com/problems/valid-anagram/description/)

---

## 💡 Sample Input & Output

```java
Input:
s = "listen"
t = "silent"

Output:
Strings are anagrams
🛠️ Solution Approach
The algorithm follows these steps:

If the lengths of the strings are different, they can't be anagrams.

Convert both strings to character arrays.

Sort both arrays.

Compare sorted arrays to determine if they are equal.

✅ Topics Covered
String Manipulation

Character Arrays

Sorting

Arrays.equals()

Time and Space Complexity

💻 How to Run
📁 File:
Anagram.java

🔧 Steps:
Make sure you have Java installed on your system.

Save the code in a file named Anagram.java.

Open terminal and run:

bash
Copy
Edit
javac Anagram.java
java Anagram
📷 Visual Explanation

🔗 Click to view image on GitHub

⏱️ Time & Space Complexity
Operation	Complexity
Time	O(n log n) due to sorting
Space	O(n) for character arrays

🧪 Test Cases
s	t	Output
"hello"	"olehl"	true
"abc"	"def"	false
"aacc"	"ccac"	false

🧠 Alternate Approach
You can also use a HashMap or frequency array to compare character counts without sorting. This improves time complexity to O(n).

🙌 Author
Shruti Lad
🔗 LinkedIn - shrutilad35
📧 shrutilad35@gmail.com

