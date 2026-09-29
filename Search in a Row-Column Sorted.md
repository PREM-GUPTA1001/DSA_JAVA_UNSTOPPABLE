## 01. Search in a Row-Column Sorted

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/search-in-a-matrix17201720/1?utm=codolio)

### Problem Description

**Task:** Given a 2D integer matrix mat[][] of size n x m, where every row and column is sorted in increasing order and a number x, return true if the element x is present in the matrix. Otherwise, return false.Examples:Input: mat[][] = [[3, 30, 38], [20, 52, 54], [35, 60, 69]], x = 62

#### Examples

##### Example 1

- **Output:**
```text
true
```
- **Explanation:** 3 is present in the matrix.

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n + m)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-09-30 02:41:34
- **Status:** Correct
- **Marks:** 2

```java
class Solution {
    public static boolean matSearch(int mat[][], int x) {

        // logic is top-right se start karenge
        // agar current x se bada hai to left jayenge
        // agar current x se chhota hai to down jayenge

        int row = 0;
        int col = mat[0].length - 1;

        while(row < mat.length && col >= 0) {

            // current element x ke equal hai
            // matlab element mil gaya
            if(mat[row][col] == x) {
                return true;
            }

            // current element x se bada hai
            // left side me smaller elements hain
            else if(mat[row][col] > x) {
                col--;
            }

            // current element x se chhota hai
            // next row me bigger elements mil sakte hain
            else {
                row++;
            }
        }

        return false;
    }
}
```

*Generated on: 30/9/2026, 2:47:02 am*