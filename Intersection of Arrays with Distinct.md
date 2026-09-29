## 01. Intersection of Arrays with Distinct

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/intersection-of-two-arrays2404/1?utm=codolio)

### Problem Description

**Task:** Given two unsorted integer arrays a[] and b[] each consisting of distinct elements, the task is to return the count of elements in the intersection (or common elements) of the two arrays.Intersection of two arrays can be defined as the set containing distinct common elements between the two arrays. Examples:Input: a[] = [89, 24, 75, 11, 23], b[] = [89, 2, 4]Output: 1

#### Examples

##### Example 1

- **Output:**
```text
2
```
- **Explanation:** 20 and 30 are the elements in the intersection of the two arrays.

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n + m)
- **Expected Auxiliary Space Complexity:** O(n)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-09-30 02:28:39
- **Status:** Correct
- **Marks:** 2

```java
class Solution {
    public static int intersectSize(int nums1[], int nums2[]) {

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        int count = 0;

        for(int i = 0; i < nums2.length; i++) {

            if(set.contains(nums2[i])) {
                count++;
                set.remove(nums2[i]);
            }
        }

        return count;
    }
}
```

*Generated on: 30/9/2026, 2:28:53 am*