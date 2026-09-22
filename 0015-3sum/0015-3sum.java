class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        // Pehle sort karenge
        // taaki duplicates skip kar sake aur two pointer laga sake
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            // Same first element dobara nahi lena
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            // Agar smallest 3 numbers ka sum hi 0 se bada hai
            // to aage bhi sum 0 nahi ho sakta
            if (nums[i] + nums[i + 1] + nums[i + 2] > 0)
                break;

            // Agar current + largest 2 numbers ka sum 0 se chhota hai
            // to left side se next i try karenge
            if (nums[i] + nums[nums.length - 2] + nums[nums.length - 1] < 0)
                continue;

            int left = i + 1;
            int right = nums.length - 1;

            // Ab remaining 2 numbers two pointer se find karenge
            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                // Sum chhota hai
                // left ko aage badhayenge
                if (sum < 0) {
                    left++;
                }

                // Sum bada hai
                // right ko peeche layenge
                else if (sum > 0) {
                    right--;
                }

                // Sum 0 mil gaya
                else {
                    ans.add(Arrays.asList(
                        nums[i], nums[left], nums[right]
                    ));

                    // Dono pointers move karenge
                    left++;
                    right--;

                    // Same left value dobara nahi lena
                    while (left < right &&
                           nums[left] == nums[left - 1]) {
                        left++;
                    }

                    // Same right value dobara nahi lena
                    while (left < right &&
                           nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
            }
        }

        return ans;
    }
}