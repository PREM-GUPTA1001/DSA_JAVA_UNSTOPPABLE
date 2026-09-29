## 01. Next Permutation

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/next-permutation5226/1?utm=codolio)

### Problem Description

**Task:** Given an array of integers arr[] representing a permutation, implement the next permutation that rearranges the numbers into the lexicographically smallest greater (or next) permutation.
If no next permutation exists, rearrange the numbers into the lowest possible order (i.e., sorted in ascending order).

#### Examples

##### Example 1

- **Input:**
```text
arr[] = [2, 4, 1, 7, 5, 0]
```
- **Output:**
```text
[2, 4, 5, 0, 1, 7]
```
- **Explanation:** The next permutation of the given array is [2, 4, 5, 0, 1, 7].

##### Example 2

- **Input:**
```text
arr[] = [3, 2, 1]
```
- **Output:**
```text
[1, 2, 3]
```
- **Explanation:** As arr[] is the last permutation, the next permutation is the lowest one.

##### Example 3

- **Input:**
```text
arr[] = [3, 4, 2, 5, 1]
```
- **Output:**
```text
[3, 4, 5, 1, 2]
```
- **Explanation:** The next permutation of the given array is [3, 4, 5, 1, 2].

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (10)

#### Solution 1 (Java)

- **Submitted:** 2026-09-29 21:44:47
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
	public void nextPermutation(int[] nums) {
		// Pivot = Right se pehla element jo apne next element se chhota ho. Ye wahi element hota hai jise change karke next permutation ban sakta hai.
		/*
		nums = [1, 2, 3, 6, 5, 4]
		[1, 2, 4, 6, 5, 3]
		[1, 2, 4, 3, 5, 6]
		*/
		/// another testcase :-- [1,2,3,6, 4,5]
		int n = nums.length;
		// n = 6
		int pivot = -1;
		
		for (int i = n - 2; i >= 0; i--) {
			// i = 4
			// 5 < 4 x
			// 6 < 5 x
			// 3 < 6
			if (nums[i] < nums[i + 1]) {
				pivot = i;
				// pivot = 2
				break;
			}
		}
		// agar pivot mil gya
		if (pivot != -1) {
			for (int i = n - 1; i > pivot; i--) {
				// i = 5 ; i > 2; i--
				// nums = [1,2,3,6,5,4]
				if (nums[i] > nums[pivot]) {
					// 4 > 3 --> h
					int temp = nums[i];
					nums[i] = nums[pivot];
					nums[pivot] = temp;
					break;
				}
			}
		}
		// after swap --> [1,2,4,6,5,3]
		
		int left = pivot + 1;
		// left = 3
		int right = n - 1;
		// right = 5
		// 3 < 5
		while (left < right) {
			int temp = nums[left];
			nums[left] = nums[right];
			nums[right] = temp;
			
			left++;
			right--;
		}
	}
	// after reverse --> [1,2,4,3,5,6]
	/*
	Current Array
	[1, 2, 4, 6, 5, 3]
	
	Pivot ke baad ka part
	
	6, 5, 3
	
	Ye already descending order me hai.
	
	Descending order maximum arrangement hoti hai.
	
	Hume next permutation chahiye,
	isliye pivot ke baad wale part ko
	minimum arrangement me convert karna hoga.
	
	Descending ko minimum banane ka easiest way hai
	Reverse kar dena.
	*/
}
```
