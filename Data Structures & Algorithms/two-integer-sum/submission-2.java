class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> set = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            set.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i++){
            if(set.get(target-nums[i]) != null && set.get(target-nums[i]) != i)
            {
                return new int[]{i,set.get(target-nums[i])};
            } 
        }
        return null;
    }
}
