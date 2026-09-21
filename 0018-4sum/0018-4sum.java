class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> ans = new ArrayList<>();

        // Pehle sort karenge taaki two pointer laga sake
        // aur duplicate quadruplets ko easily skip kar sake
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {

            // Same first element dobara nahi lena
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            for (int j = i + 1; j < nums.length - 2; j++) {

                // Same second element dobara nahi lena
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;

                // Ab remaining 2 elements two pointer se find karenge
                int left = j + 1;
                int right = nums.length - 1;

                while (left < right) {

                    long sum = (long) nums[i] + nums[j]
                             + nums[left] + nums[right];

                    // Example:
                    // nums = [-2,-1,0,0,1,2], target = 0
                    //
                    // i = 0 → -2
                    // j = 1 → -1
                    // left = 2 → 0
                    // right = 5 → 2
                    // sum = -2 + (-1) + 0 + 2 = -1
                    // sum target se chhota hai
                    // isliye left ko aage badhayenge

                    if (sum < target) {
                        left++;
                    }

                    // Sum target se bada hai
                    // to right ko peeche le aayenge
                    else if (sum > target) {
                        right--;
                    }

                    // Sum target ke equal mil gaya
                    // to ye ek valid quadruplet hai
                    else {
                        ans.add(Arrays.asList(
                            nums[i], nums[j], nums[left], nums[right]
                        ));

                        // Example:
                        // -2 + 0 + 0 + 2 = 0
                        // → [-2,0,0,2] answer me add

                        left++;
                        right--;

                        // Same left value dobara nahi lena
                        while (left < right && nums[left] == nums[left - 1])
                            left++;

                        // Same right value dobara nahi lena
                        while (left < right && nums[right] == nums[right + 1])
                            right--;
                    }
                }
            }
        }

        return ans;
    }
}