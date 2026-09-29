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

#### Solution 2 (Java)

- **Submitted:** 2026-09-29 17:40:37
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

#### Solution 3 (Java)

- **Submitted:** 2026-09-29 17:40:32
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

#### Solution 4 (Java)

- **Submitted:** 2026-09-29 17:40:26
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

#### Solution 5 (Java)

- **Submitted:** 2026-09-29 17:40:17
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

#### Solution 6 (Java)

- **Submitted:** 2026-07-13 14:44:38
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
  public:
    int findDuplicate(vector<int>& nums) {
        // code here
        int slow = nums[0];
        int fast = nums[0];
        // pehle aapn check krte h duplicate exist krta h y nhi
         do {
            slow = nums[slow];  // ek ko 1 step 
            fast = nums[nums[fast]]; // doosre ko 2 step
        } while (slow != fast);
        // to ek ko starting point p krte h 
        // doosre ko meeting point p 
        slow = nums[0];
         while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
};
```

#### Solution 7 (Java)

- **Submitted:** 2026-07-13 13:43:03
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
  public:
    int findDuplicate(vector<int>& nums) {
        // code here
        int slow = nums[0];
        int fast = nums[0];
        // pehle aapn check krte h duplicate exist krta h y nhi
         do {
            slow = nums[slow];  // ek ko 1 step 
            fast = nums[nums[fast]]; // doosre ko 2 step
        } while (slow != fast);
        // to ek ko starting point p krte h 
        // doosre ko meeting point p 
        slow = nums[0];
         while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
};
```

#### Solution 8 (Java)

- **Submitted:** 2026-07-04 12:00:16
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    public int findDuplicate(int[] nums) {
        // code here
        int slow = nums[0];
        int fast = nums[0];
        // pehle aapn check krte h duplicate exist krta h y nhi
         do {
            slow = nums[slow];  // ek ko 1 step 
            fast = nums[nums[fast]]; // doosre ko 2 step
        } while (slow != fast);
        // to ek ko starting point p krte h 
        // doosre ko meeting point p 
        slow = nums[0];
         while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}
```

#### Solution 9 (Java)

- **Submitted:** 2026-07-04 11:59:14
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    public int findDuplicate(int[] nums) {
        // code here
        int slow = nums[0];
        int fast = nums[0];
        // pehle aapn check krte h duplicate exist krta h y nhi
         do {
            slow = nums[slow];  // ek ko 1 step 
            fast = nums[nums[fast]]; // doosre ko 2 step
        } while (slow != fast);
        // to ek ko starting point p krte h 
        // doosre ko meeting point p 
        slow = nums[0];
         while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}
```

#### Solution 10 (Java)

- **Submitted:** 2026-07-04 11:59:08
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    public int findDuplicate(int[] nums) {
        // code here
        int slow = nums[0];
        int fast = nums[0];
        // pehle aapn check krte h duplicate exist krta h y nhi
         do {
            slow = nums[slow];  // ek ko 1 step 
            fast = nums[nums[fast]]; // doosre ko 2 step
        } while (slow != fast);
        // to ek ko starting point p krte h 
        // doosre ko meeting point p 
        slow = nums[0];
         while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}
```

*Generated on: 29/9/2026, 5:43:22 pm*