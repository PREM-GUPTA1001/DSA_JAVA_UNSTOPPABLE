class Solution {
    public int[] distributeCandies(int candies, int num_people) {
    // logic is candies < num_people se to return  krna nothing;
    // int i = 0; 
    // then we are taking an loop inside that 
    // current m se candies add on krenge current m se candies subtract krenge jb tk candies 0 se bda hoga 
// Input: candies = 7, num_people = 4
// Output: [1,2,3,1]
      int[] ans = new int[num_people];
// [0, 0, 0, 0]
        int give = 1;
        int i = 0;

        // candies khatam hone tak distribute karenge
    while(candies > 0) {

            // jitni candies deni hain
            // agar available candies kam hain to remaining de denge
            int current = Math.min(give, candies);
// c = min(1, 7);
// c = (2, 6);
// c = (3, 4);
// c = min(4, 1); 
            ans[i] += current;
// ans[i] += 1 --> ans[0] = 1
// ans[i] += 2 --> ans[1] = 2
// ans[i] += 3 --> ans[2] = 3
// ans[i] += 1 --> ans[3] = 1
            candies -= current;
// c = 7 - 1 = 6
// c = 6 - 2 = 4
// c = 4 - 3 = 1
            // next person
            i = (i + 1) % num_people;
// i = 2;
// i = 3;

            give++;
// 2
// 3
// 4
        }

        return ans;
        // 
    }
}