class Solution {
    public boolean isValid(String s) {
        var stack = new Stack<Character>();
        for(var ch:s.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{')
                stack.add(ch);
            if(ch == ')'){
                if(stack.size() == 0)
                    return false;
                if(stack.pop() != '(')
                    return false;
            }
            if(ch == ']'){
                if(stack.size() == 0)
                    return false;
                if(stack.pop() != '[')
                    return false;
            }
            if(ch == '}'){
                if(stack.size() == 0)
                    return false;
                if(stack.pop() != '{')
                    return false;
            }
        }
        if(stack.size() != 0)
            return false;
        return true;
    }
}
