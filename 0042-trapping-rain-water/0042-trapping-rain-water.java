class Solution {
public int trap(int[] height) {
    // 0, 1, 0, 2, 1, 0, 3, 2, 1, 2, 1
    int left = 0;
    int right = height.length -1;// 10
    int leftMax = 0; 
    int rightMax = 0;

    int water = 0;
        while(left < right) {
    // 0 < 11 --> 1. 0 <= 1 --> a. 0 >= 0 lm = 0;
    // 1 < 11 --> 1. 1<=1 -->a. 1 >= 0 lm = 1;
    // 2 < 11 --> 1. 0<=1->a. w=1
    // 3 < 11 -->2. 2>=1--> a.1>=0--> rm = 1 r--;
    // 3 < 10 lm = 2;
    // 4 < 10 --> 2. 1. rm = 2; r--;
    // 4 < 9 -->1. 1<=1--> b. w = 2
    // 5 < 9-->1.0<=1 --> b. w = 4
    // 6 < 9-->1.1<=1 --> b. w = 5
    // 7 < 9-->2-->b --> w= 6
    // 7 < 8 --> r--
    // 7 < 7
    
    // height doosre side ki label m le kr aaenge
    // tb n uske beach k water aaega consumed
            if(height[left] <= height[right]) {
                if(height[left] >= leftMax) {
         leftMax = height[left];
                } else {

                    water += leftMax - height[left];
                }

                left++;
            } else {
                // 1 >= rm --> rm = 1
                if(height[right] >= rightMax) {

                    rightMax = height[right];
                } else {

                    water += rightMax - height[right];
                }

                right--;
            }
        }

        return water;
    }
}
