## 01. Two Sum - Pair with Given Sum

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/key-pair5616/1?utm=codolio)

### Problem Description

**Task:** Given an array arr[] of integers and another integer target. Determine if there exist two distinct indices such that the sum of their elements is equal to the target.Examples:Input: arr[] = [0, -1, 2, -3, 1], target = -2

#### Examples

##### Example 1

- **Output:**
```text
false
```
- **Explanation:** No pair is possible as only one element is present in arr[]

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(n)

### Accepted Solutions (3)

#### Solution 1 (Java)

- **Submitted:** 2026-09-30 02:06:31
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    boolean twoSum(int arr[], int target) {

        // Test Case:
        // arr = [2, 7, 11, 15]
        // target = 9
        // Output = true

        HashSet<Integer> set = new HashSet<>();

        // logic is hum ek HashSet me pehle aaye hue numbers store karenge
        // aur current number ke liye check karenge ki target complete karne wala number pehle aaya hai ya nahi

        for(int num : arr) {

            int need = target - num;

            // i = 0, num = 2
            // need = 9 - 2 = 7
            // set me 7 nahi hai
            // isliye 2 ko set me add karenge
            // set = [2]

            // i = 1, num = 7
            // need = 9 - 7 = 2
            // set me 2 already hai
            // matlab 2 + 7 = 9
            // pair mil gaya -> true return

            if(set.contains(need)) {
                return true;
            }

            // agar need nahi mila to current number ko store karenge
            set.add(num);
        }

        // agar pura array check ho gaya aur pair nahi mila
        return false;
    }
}
```

#### Solution 2 (Java)

- **Submitted:** 2026-09-30 02:06:17
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    boolean twoSum(int arr[], int target) {

        // Test Case:
        // arr = [2, 7, 11, 15]
        // target = 9
        // Output = true

        HashSet<Integer> set = new HashSet<>();

        // logic is hum ek HashSet me pehle aaye hue numbers store karenge
        // aur current number ke liye check karenge ki target complete karne wala number pehle aaya hai ya nahi

        for(int num : arr) {

            int need = target - num;

            // i = 0, num = 2
            // need = 9 - 2 = 7
            // set me 7 nahi hai
            // isliye 2 ko set me add karenge
            // set = [2]

            // i = 1, num = 7
            // need = 9 - 7 = 2
            // set me 2 already hai
            // matlab 2 + 7 = 9
            // pair mil gaya -> true return

            if(set.contains(need)) {
                return true;
            }

            // agar need nahi mila to current number ko store karenge
            set.add(num);
        }

        // agar pura array check ho gaya aur pair nahi mila
        return false;
    }
}
```

#### Solution 3 (Java)

- **Submitted:** 2026-09-30 02:06:12
- **Status:** Correct
- **Marks:** 2

```java
class Solution {
    boolean twoSum(int arr[], int target) {

        // Test Case:
        // arr = [2, 7, 11, 15]
        // target = 9
        // Output = true

        HashSet<Integer> set = new HashSet<>();

        // logic is hum ek HashSet me pehle aaye hue numbers store karenge
        // aur current number ke liye check karenge ki target complete karne wala number pehle aaya hai ya nahi

        for(int num : arr) {

            int need = target - num;

            // i = 0, num = 2
            // need = 9 - 2 = 7
            // set me 7 nahi hai
            // isliye 2 ko set me add karenge
            // set = [2]

            // i = 1, num = 7
            // need = 9 - 7 = 2
            // set me 2 already hai
            // matlab 2 + 7 = 9
            // pair mil gaya -> true return

            if(set.contains(need)) {
                return true;
            }

            // agar need nahi mila to current number ko store karenge
            set.add(num);
        }

        // agar pura array check ho gaya aur pair nahi mila
        return false;
    }
}
```

*Generated on: 30/9/2026, 2:06:57 am*