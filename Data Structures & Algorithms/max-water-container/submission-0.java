class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length - 1;
        int resultMax = 0;
        while(i < j){
            int currentArea = Math.min(heights[i], heights[j])*(j-i);
            if(currentArea > resultMax) resultMax = currentArea;
            if(heights[i] > heights[j]) j--;
            else i++;
        }
        return resultMax;
    }
}
