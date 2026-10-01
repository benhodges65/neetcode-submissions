class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for (String str : strs) {
            // 1. Convert string to character array
            char[] charArray = str.toCharArray();
            
            // 2. Sort the array so anagrams match
            Arrays.sort(charArray);
            
            // 3. Convert back to string to use as a valid HashMap key
            String sortedKey = new String(charArray);
            
            // 4. Retrieve or initialize the anagram list and add the original string
            map.computeIfAbsent(sortedKey, k -> new ArrayList<>()).add(str);
        }
        
        // 5. Wrap all map values inside a new ArrayList and return
        return new ArrayList<>(map.values());
    }
}
