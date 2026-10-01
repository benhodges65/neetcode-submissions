class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int start = i + 1;
            int end = nums.length - 1;
            while(end > start){
                if(nums[i] + nums[start] + nums[end] == 0){
                    result.add(new ArrayList<Integer>(List.of(nums[i], nums[start], nums[end])));
                    end--;
                    start++;
                    while (end > start && nums[start] == nums[start - 1]) start++;
                }
                else if(nums[i] + nums[start] + nums[end] > 0){
                    end--;
                }
                else {
                    start++;
                }
            }
        }
        return result;
    }
}
