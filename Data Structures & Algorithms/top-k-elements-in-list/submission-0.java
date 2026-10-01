class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Count frequencies
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        // Buckets: index = frequency
        List<Integer>[] freq = new ArrayList[nums.length + 1];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            if (freq[count] == null) {
                freq[count] = new ArrayList<>();
            }
            freq[count].add(entry.getKey());
        }

        // Collect top k
        int[] result = new int[k];
        int idx = 0;

        for (int i = freq.length - 1; i >= 0 && idx < k; i--) {
            if (freq[i] != null) {
                for (int n : freq[i]) {
                    result[idx++] = n;
                    if (idx == k) break;
                }
            }
        }
        return result;
    }
}