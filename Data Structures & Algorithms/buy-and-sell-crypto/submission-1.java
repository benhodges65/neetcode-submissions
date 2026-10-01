class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int result = 0;
        for(int r = 0; r < prices.length; r++){
            if(prices[l] < prices[r]){
                result = Math.max(result, prices[r] - prices[l]);
            } else {
                l = r;
            }
        }
        return result;
    }
}
