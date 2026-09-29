## 01. Find Only Repetitive Element from 1 to n-1

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/find-repetitive-element-from-1-to-n-1/1?utm=codolio)

### Problem Description

**Task:** Given an array arr[] of size n, filled with numbers from 1 to n-1 in random order. The array has only one repetitive element. Return the repetitive element.

> **Note:** It is guaranteed that there is a repeating element present in the array.

#### Examples

##### Example 1

- **Input:**
```text
arr[] = [1, 3, 2, 3, 4]Output: 3 Explanation: The number 3 is the only repeating element.
```

##### Example 2

- **Input:**
```text
arr[] = [1, 5, 1, 2, 3, 4]Output: 1 Explanation: The number 1 is the only repeating element.
```

##### Example 3

- **Input:**
```text
arr[] = [1, 1] Output: 1Explanation: The array is of size 2 with both elements being 1, making 1 the repeating element.
```

#### Constraints

- **1.** `2 ≤ arr.size() ≤ 10⁵¹ ≤ arr[i] ≤ n-1`

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (10)

#### Solution 1 (Java)

- **Submitted:** 2026-09-29 17:40:44
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    public int findDuplicate(int[] nums) {
        // pehle aapn duplicate check krenge ki duplicate exist krta h y nhi
               int slow = nums[0];
               int fast = nums[0];
            do {
                   slow = nums[slow];
                   fast = nums[nums[fast]];
               } while(slow != fast);

               // then aapn ek pointer ko start se point krna start kreng  aur doosre ko end tk jaise hi mile return kr do first pointer 
               slow = nums[0];

               // dono ko same speed se chalayenge
               while(slow != fast) {
                   slow = nums[slow];
                   fast = nums[fast];
               }

               // jahan dono milenge wahi duplicate hai
               return slow;
    }
}
```
