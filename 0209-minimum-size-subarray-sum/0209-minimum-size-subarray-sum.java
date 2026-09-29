
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // dry run guys
        //
        // target = 5
        // nums = [2,3,1]
        // Output = 2
        int left = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {

            sum += nums[right];

            // right = 0
            // num = 2
            // sum = 2
            // 2 < 5, abhi window valid nahi hai

            // right = 1
            // num = 3
            // sum = 5
            // sum >= 5
            // window = [2,3]
            // length = 2
            // ans = 2

            // 2 ko remove karenge
            // sum = 5 - 2 = 3
            // left = 1
            // ab sum < 5

            // right = 2
            // num = 1
            // sum = 3 + 1 = 4
            // sum < 5, kuch remove nahi karna

            while (sum >= target) {
                ans = Math.min(ans, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}