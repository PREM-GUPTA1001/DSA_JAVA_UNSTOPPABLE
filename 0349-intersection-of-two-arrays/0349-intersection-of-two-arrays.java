class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set =new HashSet<>();
        int result[] = new int[nums2.length];
        int j = 0;
        for(int i=0; i<nums1.length; i++){
             set.add(nums1[i]);
        }

        for(int i=0; i<nums2.length; i++){
            if(set.contains(nums2[i])){
                result[j] = nums2[i];
                j++;
                set.remove(nums2[i]);
            }
        }
    
    int[] finalResult = new int[j];
        for (int i = 0; i < j; i++) {
            finalResult[i] = result[i];
        }

        return finalResult;
        
    }
}