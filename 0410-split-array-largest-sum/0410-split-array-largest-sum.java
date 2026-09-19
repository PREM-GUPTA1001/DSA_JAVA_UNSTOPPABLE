class Solution {
    public int splitArray(int[] nums, int k) {

        // Logic is answer ko binary search karenge
        // low = largest element, kyunki ek subarray me ye to aana hi hai
        // high = total sum, kyunki saare elements ek hi subarray me ho sakte hain
        int low = 0, high = 0;

        for (int num : nums) {
            low = Math.max(low, num);
            high += num;
        }

        // mid ko maximum allowed subarray sum maanenge
        while (low < high) {
            int mid = low + (high - low) / 2;

            // ab check karenge ki mid ke andar
            // maximum sum rakhte hue kitne subarrays ban rahe hain
            int sum = 0;
            int count = 1;

            for (int num : nums) {

                // agar current element add karne se mid cross ho jayega
                // to new subarray start karenge
                if (sum + num > mid) {
                    count++;
                    sum = num;
                }
                else {
                    sum += num;
                }
            }

            // agar k se zyada subarrays ban gaye
            // to mid chhota hai, isliye answer right side me hoga
            if (count > k) {
                low = mid + 1;
            }
            else {
                // k ya usse kam subarrays ban rahe hain
                // matlab mid possible hai, aur smaller answer try karenge
                high = mid;
            }
        }

        return low;
    }
}