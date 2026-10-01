class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        int currentMax = 0;
        for(int i : nums){
            int temp = 1;
            int start = i;
            set.add(i);
            while(set.contains(start-1)) start--;
            while(set.contains(start+1)){
                temp++;
                start++;
            } 
            if(temp > currentMax) currentMax = temp;
        }
        return currentMax;
    }
}
