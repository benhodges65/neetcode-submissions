public class Solution {
    public bool IsValid(string s) {
        Stack<char> stack = new Stack<char>();
        foreach(char character in s){
            if(character == '(' || character == '{' || character =='['){
                stack.Push(character);
            } else {
                if(stack.Count == 0) return false;
                char popped = stack.Pop();
                if(character == ')' && popped != '(') return false;
                if(character == '}' && popped != '{') return false;
                if(character == ']' && popped != '[') return false;
            }
        }
        if(stack.Count == 0) return true;
        return false;
    }
}
