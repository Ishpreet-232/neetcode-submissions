class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if(s.length()<2) return false;
        for(char c : s.toCharArray()){
            if(c=='{'||c=='['||c=='('){
                stack.push(c);
                continue;
            }
            else if(stack.empty()) return false;
            else{
                char top = stack.peek();
                if((c=='}' && top=='{')||(c==']' && top=='[')||(c==')' && top=='(')) stack.pop();
                else return false;
            }
        }
        return stack.empty();
    }
}
