class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        for(String s : tokens){
            int temp;
            if(s.equals("+")) stack.push(stack.pop() + stack.pop());
            else if(s.equals("-")) {
                temp = stack.pop();
                stack.push(stack.pop() - temp);
            }
            else if(s.equals("/")) {
                temp = stack.pop();
                stack.push(stack.pop() / temp);
            }
            else if(s.equals("*")) stack.push(stack.pop() * stack.pop());
            else{
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}
