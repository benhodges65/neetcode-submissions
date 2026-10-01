class Solution {
    public boolean isPalindrome(String s) {
        String lowerCaseString = s.toLowerCase();
        Stack<Character> stack = new Stack<Character>();
        for(char c : lowerCaseString.toCharArray()){
            if(Character.isLetter(c) || Character.isDigit(c))
                stack.push(c);
        }
        for(char c : lowerCaseString.toCharArray()){
            if((Character.isLetter(c) || Character.isDigit(c)) && c != stack.pop()) return false;
        }
        return true;
    }
}
