## 01. Kth Smallest

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/kth-smallest-element5635/1?utm=codolio)

### Problem Description

**Task:** Given an integer array arr[] and an integer k, find and return the k^th smallest element in the given array.Examples :Input: arr[] = [10, 5, 4, 3, 48, 6, 2, 33, 53, 10], k = 4Output: 5

#### Examples

##### Example 1

- **Explanation:** 3rd smallest element in the given array is 7.

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n log k)
- **Expected Auxiliary Space Complexity:** O(k)

### Accepted Solutions (15)

#### Solution 1 (Java)

- **Submitted:** 2026-09-28 23:23:40
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    public int kthSmallest(int[] arr, int k) {

        int left = 0;
        int right = arr.length - 1;

        // k-th smallest ka index = k - 1
        int target = k - 1;

        while(left <= right) {

            // right wale element ko pivot maan rahe hain
            int pivot = arr[right];

            int p = left;

            // pivot se chhote elements ko left side me laayenge
            for(int i = left; i < right; i++) {

                if(arr[i] <= pivot) {

                    int temp = arr[i];
                    arr[i] = arr[p];
                    arr[p] = temp;

                    p++;
                }
            }

            // pivot ko correct position par rakh denge
            int temp = arr[p];
            arr[p] = arr[right];
            arr[right] = temp;

            // pivot target position par mil gaya
            if(p == target) {
                return arr[p];
            }

            // target right side me hai
            if(p < target) {
                left = p + 1;
            }

            // target left side me hai
            else {
                right = p - 1;
            }
        }

        return -1;
    }
}
```

#### Solution 2 (Java)

- **Submitted:** 2026-09-28 23:21:50
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    public int kthSmallest(int[] arr, int k) {

        int left = 0;
        int right = arr.length - 1;

        // k-th smallest ka index = k - 1
        int target = k - 1;

        while(left <= right) {

            // right wale element ko pivot maan rahe hain
            int pivot = arr[right];

            int p = left;

            // pivot se chhote elements ko left side me laayenge
            for(int i = left; i < right; i++) {

                if(arr[i] <= pivot) {

                    int temp = arr[i];
                    arr[i] = arr[p];
                    arr[p] = temp;

                    p++;
                }
            }

            // pivot ko correct position par rakh denge
            int temp = arr[p];
            arr[p] = arr[right];
            arr[right] = temp;

            // pivot target position par mil gaya
            if(p == target) {
                return arr[p];
            }

            // target right side me hai
            if(p < target) {
                left = p + 1;
            }

            // target left side me hai
            else {
                right = p - 1;
            }
        }

        return -1;
    }
}
```

#### Solution 3 (Java)

- **Submitted:** 2026-07-11 16:53:46
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    public int kthSmallest(int[] arr, int k) {
        // firstly sort then return k-1th element
        Arrays.sort(arr);
        return arr[k-1];
    }
}
```

#### Solution 4 (Java)

- **Submitted:** 2026-07-11 16:53:40
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    public int kthSmallest(int[] arr, int k) {
        // firstly sort then return k-1th element
        Arrays.sort(arr);
        return arr[k-1];
    }
}
```

#### Solution 5 (Java)

- **Submitted:** 2026-07-03 19:24:58
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    public int kthSmallest(int[] arr, int k) {
        // firstly sort then return k-1th element
        Arrays.sort(arr);
        return arr[k-1];
    }
}
```

#### Solution 6 (Java)

- **Submitted:** 2026-07-03 19:22:32
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        Arrays.sort(arr);
        return arr[k-1];
    }
}
```

#### Solution 7 (Java)

- **Submitted:** 2026-07-03 19:22:13
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        Arrays.sort(arr);
        return arr[k-1];
    }
}
```

#### Solution 8 (Java)

- **Submitted:** 2026-07-03 19:22:08
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        Arrays.sort(arr);
        return arr[k-1];
    }
}
```

#### Solution 9 (Java)

- **Submitted:** 2026-07-03 19:22:02
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        Arrays.sort(arr);
        return arr[k-1];
    }
}
```

#### Solution 10 (Java)

- **Submitted:** 2026-07-03 19:21:56
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        Arrays.sort(arr);
        return arr[k-1];
    }
}
```

#### Solution 11 (Java)

- **Submitted:** 2026-06-10 22:38:27
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    public int kthSmallest(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }
}
```

#### Solution 12 (Java)

- **Submitted:** 2026-06-10 22:38:13
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    public int kthSmallest(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }
}
```

#### Solution 13 (Java)

- **Submitted:** 2026-04-26 12:19:02
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    public int kthSmallest(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }
}
```

#### Solution 14 (Java)

- **Submitted:** 2026-04-26 12:18:18
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
  public:
    int kthSmallest(vector<int> &arr, int k) {
        sort(arr.begin(), arr.end());
        return arr[k - 1];
    }
};
```

#### Solution 15 (Java)

- **Submitted:** 2025-11-12 19:53:45
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
  public:
    int kthSmallest(vector<int> &arr, int k) {
        sort(arr.begin(), arr.end());
        return arr[k - 1];
    }
};
```

*Generated on: 28/9/2026, 11:27:10 pm*