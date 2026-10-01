class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(Character c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '[') stack.push(c);
            else if(c == ')' && (stack.isEmpty() || stack.pop() != '(')) return false;
            else if(c == '}' && (stack.isEmpty() || stack.pop() != '{')) return false;
            else if(c == ']' && (stack.isEmpty() || stack.pop() != '[')) return false;
        }
        if(stack.isEmpty()) return true;
        return false;
    }
}
