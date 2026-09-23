class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        // [-1, 0 , 1, 2, -1, -4]
        Arrays.sort(nums);
        // [-4, -1, -1, 0, 1, 2]
        //  0    1   2   3  4  5

        // [0, 0, 0]

        // [1,2,0,1,0,0,0,0]-->
        //  [0, 0, 0, 0, 0, 1, 1, 2]
        //  0  1  2   3  4  5  6  7
        for (int i = 0; i < nums.length - 2; i++) {
// i --> 0 , i < nums.length - 2 --> i < 4; i++
// i --> 1 , i < 4

// i = 0 

// i = 0 --> i < 6 -->
// i = 1 --> i < 6 --> skip till 5
// i = 5 --> i < 6 -->
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int l = i + 1, r = nums.length - 1;
        // l = 1, r = 5 
        // l = 2, r = 5
        // l = 1, r = 2

// l = 1 , r = 2

// l = 1, r = 7
// l = 
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
// sum = -4 + -1 + 2 = -1 
// s = -4 + 0 + 2 = -2
// s = -4 + 1 + 2 = -1

// at i = 1
// s = -1 + -1 + 2(l = 2 , r =5)
// s = -1 + 0 + 1(l = 3, r = 4)

// at i = 2 ( l = 3, r = 5)
// s = -1 + 0 + 2 = -1 --> l = 4
// s = -1 + 1 + 2 = 2 --> r = 4

// i = 3 ( l =4, r = 5)
// s = 0 + 1 + 2 = 3 --> (r = 4)


// s =  0 + 0 + 0 = 0
//  [0, 0, 0, 0, 0, 1, 1, 2]
//  0  1  2   3  4  5  6  7
// s = 2(l --> 1, r = 7) > 0 --> r-- -->6
// s = 0 (0, 1, 4)
// s = 0 (0, 2, 3)
                if (sum < 0) l++;
                // l = 2 --> 3 --> 4 --
                // l = 4
                else if (sum > 0) r--;
// jb sum 0 mil jae 
                else {
                    ans.add(Arrays.asList(nums[i], nums[l], nums[r]));
            
                    // -1,-1, 2
                    // -1, 0, 1

                    // (0,0,0)-->0, 1, 4
                    l++; // 3 // 2 
                    // l = 2
                    r--; // 4 // 1
                    // r = 3

                    while (l < r && nums[l] == nums[l - 1]) l++;
                    // 1 < 4 --> l --> 
                     while (l < r && nums[r] == nums[r + 1]) r--;
                }
            }
        }

        return ans;
    }
}