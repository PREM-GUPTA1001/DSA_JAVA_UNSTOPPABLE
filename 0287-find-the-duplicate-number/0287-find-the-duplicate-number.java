class Solution {
    public int findDuplicate(int[] nums) {
        // pehle aapn duplicate check krenge ki duplicate exist krta h y nhi
        int slow = nums[0];
        int fast = nums[0];
     do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow != fast);

        // then aapn ek pointer ko start se point krna start kreng  aur doosre ko end tk jaise hi mile return kr do first pointer 
        slow = nums[0];

        // dono ko same speed se chalayenge
        while(slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        // jahan dono milenge wahi duplicate hai
        return slow;

    }
}