class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if(s.length()<2) return false;
        for(char c : s.toCharArray()){
            if(c=='{'||c=='['||c=='(')
            stack.push(c);
            if(stack.empty()) return false;
            else{
                char top = stack.peek();
                if(c=='}'){
                    if(top!='{') return false;
                    else stack.pop();
                }
                 if(c==']'){
                    if(top!='[') return false;
                    else stack.pop();
                }
                 if(c==')'){
                    if(top!='(') return false;
                    else stack.pop();
                }
            }
        }
        if(stack.empty())return true;
        return false;
    }
}
