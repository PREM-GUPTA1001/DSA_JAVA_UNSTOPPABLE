## 01. Chocolate Distribution Problem

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1?utm=codolio)

### Problem Description

**Task:** Given an array arr[] of positive integers, where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are m students, the task is to distribute chocolate packets among m students such that:Each student gets exactly one packet.The difference between maximum number of chocolates given to a student and minimum number is minimum and return that minimum possible difference.Examples:Input: arr = [3, 4, 1, 9, 56, 7, 9, 12], m = 5

#### Examples

##### Example 1

- **Output:**
```text
6
```
- **Explanation:** The minimum difference between maximum chocolates and minimum chocolates is 9 - 3 = 6 by choosing m packets as [3, 4, 9, 7, 9].

##### Example 2

- **Input:**
```text
arr = [7, 3, 2, 4, 9, 12, 56], m = 3
```
- **Output:**
```text
55Explanation: With 5 packets for 5 students, each student will receive one packet, so the difference is 56 - 1 = 55.
```
- **Explanation:** The minimum difference between maximum chocolates and minimum chocolates is 4 - 2 = 2 by choosing m packets as [3, 2, 4].Input: arr = [3, 4, 1, 9, 56], m = 5

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n log n)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (5)

#### Solution 1 (Java)

- **Submitted:** 2026-10-03 19:17:21
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    public int findMinDiff(int arr[], int m) {

        int n = arr.length;
        // 7
        // Agar students packets se zyada hain
        if(m > n) {
            return 0;
        }

        // Step 1: Sort array
        Arrays.sort(arr);
        // 2,3,4,7, 9, 12, 56
        int ans = Integer.MAX_VALUE;
        // 60
        // Step 2: Window size = m
        // n - m = 7 - 3 = 4
        for(int i = 0; i <= n - m; i++) {
            // i = 0, 1
            int minChocolate = arr[i]; // 2, 3
            int maxChocolate = arr[i + m - 1]; // 4, 7

            ans = Math.min(ans, maxChocolate - minChocolate);
            // ans = 2, 
        }
        return ans;
    }
}
```
