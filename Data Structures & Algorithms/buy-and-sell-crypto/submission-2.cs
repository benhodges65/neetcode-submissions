public class Solution {
    public int MaxProfit(int[] prices) {
        int minPrice = int.MaxValue;
        int result = 0;
        foreach(int price in prices){
            if(price < minPrice){
                minPrice = price;
            }
            else if (price - minPrice > result) {
                result = price - minPrice;
            }
        }
        return result;
    }
}
