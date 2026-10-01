class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int index = 0;
        HashMap<String, ArrayList<String>> strings = new HashMap<String, ArrayList<String>>();
        for(String s : strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String tempString = new String(charArray);
            if(strings.containsKey(tempString)){
                ArrayList<String> temp = strings.get(tempString);
                temp.add(s);
                strings.put(tempString, temp);
            } else {
                strings.put(tempString,  new ArrayList<>(List.of(s)));
            }
        }
        List<List<String>> result = new ArrayList<List<String>>();
        strings.entrySet()
                .stream()
                .forEach(entry -> {
                        result.add(entry.getValue());
                });
        return result;
    }
}
