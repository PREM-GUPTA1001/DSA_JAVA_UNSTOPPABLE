class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        // nums = [1,2,3,4]
        // n = 4

        int[] ans = new int[n];
        // ans = [0,0,0,0]


        int prefix = 1;
        // prefix = 1
        // starting me left side me kuch nahi hai


        for (int i = 0; i < n; i++) {

            ans[i] = prefix;

            // i = 0
            // ans[0] = 1
            // left product = 1
            // ans = [1,0,0,0]

            // i = 1
            // prefix = 1
            // ans[1] = 1
            // ans = [1,1,0,0]

            // i = 2
            // prefix = 1×2 = 2
            // ans[2] = 2
            // ans = [1,1,2,0]

            // i = 3
            // prefix = 1×2×3 = 6
            // ans[3] = 6
            // ans = [1,1,2,6]


            prefix = prefix * nums[i];

            // i = 0 → prefix = 1×1 = 1
            // i = 1 → prefix = 1×2 = 2
            // i = 2 → prefix = 2×3 = 6
            // i = 3 → prefix = 6×4 = 24
        }


        int suffix = 1;
        // ab right side se aayenge
        // suffix = 1


        for (int i = n - 1; i >= 0; i--) {

            ans[i] = ans[i] * suffix;

            // i = 3
            // ans[3] = 6 × 1 = 6
            // ans = [1,1,2,6]

            // i = 2
            // ans[2] = 2 × 4 = 8
            // ans = [1,1,8,6]

            // i = 1
            // ans[1] = 1 × 4×3 = 12
            // ans = [1,12,8,6]

            // i = 0
            // ans[0] = 1 × 4×3×2 = 24
            // ans = [24,12,8,6]


            suffix = suffix * nums[i];

            // i = 3 → suffix = 1×4 = 4
            // i = 2 → suffix = 4×3 = 12
            // i = 1 → suffix = 12×2 = 24
            // i = 0 → suffix = 24×1 = 24
        }

        return ans;
        // [24,12,8,6]
    }
}