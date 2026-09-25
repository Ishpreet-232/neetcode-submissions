class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        if(s.length()<2) return false;
        for(char c : s.toCharArray()){
            if(c=='{'||c=='['||c=='('){
                stack.push(c);
                continue;
            }
            else if(stack.isEmpty()) return false;
            else{
                char top = stack.peek();
                if((c=='}' && top=='{')||(c==']' && top=='[')||(c==')' && top=='(')) stack.pop();
                else return false;
            }
        }
        return stack.isEmpty();
    }
}
