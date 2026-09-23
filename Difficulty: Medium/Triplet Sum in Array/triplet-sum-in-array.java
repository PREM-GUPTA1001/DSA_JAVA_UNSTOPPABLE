class Solution {
    public boolean hasTripletSum(int nums[], int target) {

        // nums = [-1,0,1,2,-1,-4]
        // target = 0

        // TC --> O(n^2)
        // Space --> O(1)

        Arrays.sort(nums);

        // nums = [-4,-1,-1,0,1,2]
        // index    0  1  2 3 4 5


        for (int i = 0; i < nums.length - 2; i++) {

            // nums.length = 6
            // i < 4
            //
            // i = 0
            // i = 1
            // i = 2
            // i = 3

            int l = i + 1;
            int r = nums.length - 1;

            // i = 0
            // l = 1
            // r = 5


            while (l < r) {

                int sum = nums[i] + nums[l] + nums[r];

                // i = 0, l = 1, r = 5
                // sum = -4 + -1 + 2
                // sum = -3
                // -3 < 0 --> l++

                // l = 2


                // i = 0, l = 2, r = 5
                // sum = -4 + -1 + 2
                // sum = -3
                // -3 < 0 --> l++

                // l = 3


                // i = 0, l = 3, r = 5
                // sum = -4 + 0 + 2
                // sum = -2
                // -2 < 0 --> l++

                // l = 4


                // i = 0, l = 4, r = 5
                // sum = -4 + 1 + 2
                // sum = -1
                // -1 < 0 --> l++

                // l = 5
                // l < r false
                // while end


                // i = 1
                // nums[i] = -1
                // l = 2
                // r = 5

                // sum = -1 + -1 + 2
                // sum = 0
                // 0 == target
                // triplet mil gaya
                // [-1,-1,2]

                if (sum < target) {
                    l++;

                    // sum chhota hai
                    // isliye left ko aage badhayenge
                }

                else if (sum > target) {
                    r--;

                    // sum bada hai
                    // isliye right ko peeche karenge
                }

                else {
                    return true;

                    // sum == target
                    // valid triplet mil gaya
                    // isliye direct true return karenge
                }
            }
        }

        return false;

        // Agar poora array check karne ke baad
        // koi triplet nahi mila
        // to false return karenge
    }
}