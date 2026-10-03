## 01. Smallest Subarray Sum Greater Than x

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/smallest-subarray-with-sum-greater-than-x5651/1?utm=codolio)

### Problem Description

**Task:** Given a number x and an array of integers arr, find the smallest subarray with sum strictly greater than the given value. If such a subarray do not exist return 0 in that case.

#### Examples

##### Example 1

- **Input:**
```text
x = 51, arr[] = [1, 4, 45, 6, 0, 19]
```
- **Output:**
```text
3
```
- **Explanation:** Minimum length subarray is [4, 45, 6]

##### Example 2

- **Input:**
```text
x = 100, arr[] = [1, 10, 5, 2, 7]
```
- **Output:**
```text
0
```
- **Explanation:** No subarray exist

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (6)

#### Solution 1 (Java)

- **Submitted:** 2026-10-03 23:33:25
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    public static int smallestSubWithSum(int x, int[] arr) {
        // logic is 
        int sum = 0;
        int left = 0;
        int ans = Integer.MAX_VALUE;
    // n = 6 
        for(int right = 0; right < arr.length; right++){
            sum += arr[right];
        // s = 1 + 4 + 45 + 6 = 56
        // 56 >= 51
            while(sum > x){
                // 56 - 1 = 55 
                ans = Math.min(ans, right - left + 1);
                // ans = min(ans, 4)--> 4
                // ans = min(ans, 3 - 1 + 1) --> min(ans, 3);
                // ans = min(ans, 3 - 2 + 1) --> min(3, 2);
                
                sum -= arr[left];
                // sum = 56 - 1 = 55;
                left++;
                // 1
                // 
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
```
