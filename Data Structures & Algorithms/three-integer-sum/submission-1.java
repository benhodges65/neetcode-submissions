class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>(); 
        for(int i = 0; i < nums.length - 2; i++){
            int l = i + 1;
            int r = nums.length - 1;
            int targetSum = -nums[i];
            while(l < r){
                if(nums[l] + nums[r] == targetSum){
                    result.add(new ArrayList<Integer>(List.of(-targetSum, nums[l], nums[r])));
                    while(l < r && nums[r-1] == nums[r]) r--;
                    while(l < r && nums[l+1] == nums[r]) l++;
                    l++;
                    r--;
                } else if(nums[l] + nums[r] > targetSum){
                    r--;
                } else {
                    l++;
                }
            }
            while(i < nums.length - 2 && nums[i] == nums[i + 1]) i++;
         }
         return result;
    }
}
