class Solution { 
    public int[] intersection(int[] nums1, int[] nums2) { 

        // Test Case:
        // nums1 = [1,2,2,1]
        // nums2 = [2,2]
        // Output = [2]

        HashSet<Integer> set = new HashSet<>(); 

        // nums1 ke saare unique elements set me store karenge
        // set = [1,2]

        int result[] = new int[nums2.length]; 
        int j = 0; 

        for(int i=0; i<nums1.length; i++){ 
            set.add(nums1[i]); 
        } 

        // nums1 = [1,2,2,1]
        // set = [1,2]

        for(int i=0; i<nums2.length; i++){ 

            // i = 0
            // nums2[0] = 2
            // set me 2 present hai
            // result[0] = 2
            // j = 1
            // 2 ko set se remove karenge
            // set = [1]

            // i = 1
            // nums2[1] = 2
            // set me 2 nahi hai
            // kyunki pehle hi remove kar diya
            // isliye kuch add nahi hoga

            if(set.contains(nums2[i])){ 
                result[j] = nums2[i]; 
                j++; 
                set.remove(nums2[i]); 
            } 
        } 

        // result = [2,0]
        // j = 1
        // hume sirf first 1 element chahiye

        int[] finalResult = new int[j]; 

        for (int i = 0; i < j; i++) { 
            finalResult[i] = result[i]; 
        } 

        // finalResult = [2]

        return finalResult; 
    } 
}