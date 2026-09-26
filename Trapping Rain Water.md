## 01. Trapping Rain Water

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/trapping-rain-water-1587115621/1?utm=codolio)

### Problem Description

**Task:** Given an array arr[] with non-negative integers representing the height of blocks. If the width of each block is 1, compute how much water can be trapped between the blocks during the rainy season. Examples:Input: arr[] = [3, 0, 1, 0, 4, 0, 2]

#### Examples

##### Example 1

- **Output:**
```text
7
```
- **Explanation:** Total water trapped = 0 + 3 + 1 + 3 + 0 = 7 units.

##### Example 2

- **Input:**
```text
arr[] = [1, 2, 3, 4]
```
- **Output:**
```text
9
```
- **Explanation:** Total water trapped = 0 + 1 + 0 + 1 + 3 + 4 + 0 = 9 units.

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (5)

#### Solution 1 (Java)

- **Submitted:** 2026-09-27 00:49:11
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
	public int maxWater(int arr[]) {
		// code here
		/* Trapping rain water aapn tbhi trap kr 
		paenge jb aapn k pass left aur righ boundary hogi 
		so aapn sbse pehle left boundry as well as left
		max or right boundry as well as right max find 
		krenge bcz without two max boundry is it not a 
		possible job to trap the water */
		
		int left = 0;
		int right = arr.length - 1;
		
		int left_max = 0;
		int right_max = 0;
		int water = 0;
		
		while(left < right){
		    if(arr[left] <= arr[right]){
		        // so aapn pehle boundry lgaenge 
		        if(arr[left] >= left_max){
		            left_max = arr[left];
		        }
		        else {
		            water += left_max - arr[left];
		        }
		        left++;
		    }
		    else {
		        // ab aapn ko right boundry khadi krni h 
		        if(arr[right]  >= right_max){
		            right_max = arr[right];
		        }
		        else{
		            water += right_max - arr[right];
		        }
		        right--;
		    }
		}
		
		    return water;
	}
}
```
