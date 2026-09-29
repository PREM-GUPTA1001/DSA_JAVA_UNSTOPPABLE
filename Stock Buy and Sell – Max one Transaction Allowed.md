## 01. Stock Buy and Sell – Max one Transaction Allowed

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/buy-stock-2/1?utm=codolio)

### Problem Description

**Task:** Given an array prices[] of non-negative integers, representing the prices of the stocks on different days. The task is to find the maximum profit possible by buying and selling the stocks on different days when at most one transaction is allowed. Here one transaction means 1 buy + 1 Sell. If it is not possible to make a profit then return 0.

> **Note:** Stock must be bought before being sold.

#### Examples

##### Example 1

- **Input:**
```text
prices[] = [7, 10, 1, 3, 6, 9, 2]Output: 8Explanation: You can buy the stock on day 2 at price = 1 and sell it on day 5 at price = 9. Hence, the profit is 8.
```

##### Example 2

- **Input:**
```text
prices[] = [7, 6, 4, 3, 1]Output: 0 Explanation: Here the prices are in decreasing order, hence if we buy any day then we cannot sell it at a greater price. Hence, the answer is 0.
```

##### Example 3

- **Input:**
```text
prices[] = [1, 3, 6, 9, 11]Output: 10 Explanation: Since the array is sorted in increasing order, we can make maximum profit by buying at price[0] and selling at price[n-1].
```

#### Constraints

- **1.** `1 ≤ prices.size() ≤ 10⁵⁰ ≤ prices[i] ≤ 10⁴`

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (2)

#### Solution 1 (Java)

- **Submitted:** 2026-09-29 22:30:21
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE; // 8
        int sell = 0;  

            for(int num: prices){
                // 7 , 13
                buy = Math.min(num, buy);   
                // 7, 8 --> 7
                // 7, 1 --> 1

                sell = Math.max(sell, num - buy);
                // -1,7 --> 7
                // 7, 1 --> 7
            }
            return sell; 
    }
}
```

```

*Generated on: 29/9/2026, 10:30:40 pm*
