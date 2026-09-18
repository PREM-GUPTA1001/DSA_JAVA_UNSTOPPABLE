class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        // [0,0,0,0]
        int prefix = 1;
        
        // LOGIC IS pehle left side k product us index k pehle tk k nikal le
        for(int i = 0; i < n; i++){
            ans[i] = prefix;
            // ans[0] = 1
            // ans[1] = 1
            // ans[2] = 2
            // ans[3] = 6
            prefix = prefix * nums[i];
            // prefix = 1 * 1 = 1
            // prefix = 1 * 2 = 2
            // prefix = 2 * 3 = 6
            // prefix = 6 * 4 = 24
        }
// ans --> {1,1,2,6}
        // aur fhr suffix se multiply krte jaenge usme 
        int suffix = 1;
        for(int i = n-1; i >=0 ; i--){
            ans[i] = ans[i] * suffix;
            // ans[3] = 6* 1 = 6
            // ans[2] = 2 * 4 = 8
            // ans[1] = 1 * 12 = 12
            // ans[0] = 1 *  24
            suffix = suffix * nums[i];
            // suffix = 1 * 4
            // suffix = 4 * 3 = 12
            // suffix = 12 * 2 = 24
        }
        return ans;
    }
}