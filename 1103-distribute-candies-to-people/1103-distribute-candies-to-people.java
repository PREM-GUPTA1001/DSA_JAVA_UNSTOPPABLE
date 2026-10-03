class Solution {
    public int[] distributeCandies(int candies, int num_people) {
    // logic is candies < num_people se to return  krna nothing;
    // int i = 0;
    // we are taking an arraylist for dynamic updation on array 
    // then we are taking an loop inside that 
    // current m se candies add on krenge current m se candies subtract krenge jb tk candies 0 se bda hoga 
      int[] ans = new int[num_people];

        int give = 1;
        int i = 0;

        // candies khatam hone tak distribute karenge
        while(candies > 0) {

            // jitni candies deni hain
            // agar available candies kam hain to remaining de denge
            int current = Math.min(give, candies);

            ans[i] += current;
            candies -= current;

            // next person
            i = (i + 1) % num_people;
            give++;
        }

        return ans;
    }
}