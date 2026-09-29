## 01. Rotate by 90 degree

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/rotate-by-90-degree-1587115621/1?utm=codolio)

### Problem Description

**Task:** Given a square matrix mat[][] of size n x n. The task is to rotate it by 90 degrees in an anti-clockwise direction without using any extra space. Examples:

#### Examples

##### Example 1

- **Input:**
```text
mat[][] = [[0, 1, 2], [3, 4, 5], [6, 7, 8]]
```
- **Output:**
```text
[[2, 5, 8], [1, 4, 7], [0, 3, 6]]
```

##### Example 2

- **Input:**
```text
mat[][] = [[1, 2], [3, 4]]
```
- **Output:**
```text
[[2, 4], [1, 3]]
```

#### Constraints

- **1.** `1 ≤ n ≤ 10²⁰ ≤ mat[i][j] ≤ 10³`

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n^2)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (5)

#### Solution 1 (Java)

- **Submitted:** 2026-09-30 02:48:35
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    public void rotateMatrix(int[][] mat) {

        // Test Case:
        // 0 1 2
        // 3 4 5
        // 6 7 8

        int n = mat.length;

        // pehle transpose karenge
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        // ab har row ko reverse karenge nahi
        // anti-clockwise ke liye rows ko reverse order me rakhenge
        int top = 0;
        int bottom = n - 1;

        while(top < bottom) {
            int[] temp = mat[top];
            mat[top] = mat[bottom];
            mat[bottom] = temp;

            top++;
            bottom--;
        }

        // transpose:
        // 0 3 6
        // 1 4 7
        // 2 5 8

        // rows reverse order:
        // 2 5 8
        // 1 4 7
        // 0 3 6
    }
}
```
```

*Generated on: 30/9/2026, 2:49:30 am*
