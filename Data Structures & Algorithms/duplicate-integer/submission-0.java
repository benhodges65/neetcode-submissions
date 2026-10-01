class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> table = new HashSet<Integer>();
        for(int i : nums){
            if(table.contains(i)) return true;
            table.add(i);
        }
        return false;
    }
}