class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) return false;

        char[] sortedArray1 = s1.toCharArray();
        Arrays.sort(sortedArray1);

        for (int i = 0; i <= s2.length() - s1.length(); i++) {

            char[] substringArray = s2.substring(i, i + s1.length()).toCharArray();
            Arrays.sort(substringArray);

            if (Arrays.equals(sortedArray1, substringArray)) {
                return true;
            }
        }

        return false;
    }
}
