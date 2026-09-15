
class Solution {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // Min Heap
        // sabse chhota element top par rahega

        for (int num : nums) {

            pq.add(num);
            // current number heap me daal diya

            if (pq.size() > k) {
                pq.poll();
                // k se zyada elements ho gaye
                // sabse chhota remove kar do
            }
        }

        return pq.peek();
        // heap me k largest elements hain
        // unme sabse chhota = kth largest
    }
}