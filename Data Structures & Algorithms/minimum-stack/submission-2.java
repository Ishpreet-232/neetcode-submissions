class MinStack {
    List<Integer> stack;
    List<Integer> min;
    public MinStack() {
        stack = new ArrayList<>();
        min = new ArrayList<>();
    }
    
    public void push(int val) {
        if(stack.size()==0){
           stack.add(val);
           min.add(val);
        }
        else{
            min.add(Math.min(val,min.get(min.size()-1)));
            stack.add(val);
        }
    }
    
    public void pop() {
        int l = stack.size();
        stack.remove(l-1);
        min.remove(min.size()-1);
    }
    
    public int top() {
        int l = stack.size();
        return stack.get(l-1);
    }
    
    public int getMin() {
        return min.get(min.size()-1);
    }
}
