class Solution {
    public int maxProfit(int[] prices) {
        // buy k liye minimum lena h aur sell k liye maximum 
        int buy = Integer.MAX_VALUE; // 8
        int sell = 0;  

        for(int num: prices){
            // 7 , 13
            buy = Math.min(num, buy);   
            // 7, 8 --> 7
            // 7, 1 --> 1

            sell = Math.max(sell, num - buy);
            // -1,7 --> 7
            // 7, 1 --> 7
        }
        return sell;
    }
}