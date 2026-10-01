class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int center = start + (end - start) / 2;
            if(nums[center] > target){
                end = center - 1;
            }
            else if(nums[center] < target){
                start = center + 1;
            } else{
                return center;
            }
        }
        return -1;
    }
}
