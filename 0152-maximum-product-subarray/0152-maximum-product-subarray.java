class Solution { 
    public int maxProduct(int[] nums) { 

        // Test Case:
        // nums = [2,3,-2,4]
        // Output = 6

        int max = nums[0];
        int min = nums[0];
        int ans = nums[0];

        // logic is max ke saath min bhi rakhenge
        // kyunki negative number min ko max bana sakta hai

        for(int i = 1; i < nums.length; i++) {

            int num = nums[i];

            // i = 1
            // num = 3
            // 3 positive hai, swap nahi hoga
            // max = max(3, 2*3) = 6
            // min = min(3, 2*3) = 3
            // ans = max(2,6) = 6

            // i = 2
            // num = -2
            // negative hai, isliye max aur min swap
            // max = 3, min = 6
            // max = max(-2, 3*-2) = -2
            // min = min(-2, 6*-2) = -12
            // ans = max(6,-2) = 6

            // i = 3
            // num = 4
            // max = max(4, -2*4) = 4
            // min = min(4, -12*4) = -48
            // ans = max(6,4) = 6

            if(num < 0) {
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(num, max * num);
            min = Math.min(num, min * num);

            ans = Math.max(ans, max);
        }

        // final answer = 6
        // subarray = [2,3]
        return ans;
    }
}