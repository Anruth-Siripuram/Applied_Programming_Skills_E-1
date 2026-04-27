class MinStack {
    Stack<Integer> stack=new Stack<>();
    Stack<Integer> st=new Stack<>();    
    public void push(int val) {
        stack.push(val);
        if(st.isEmpty()||val<=st.peek()) st.push(val);
    }
    public void pop() {
        if(stack.peek().equals(st.peek())) st.pop();
        stack.pop();
    }
    
    public int top() {
       return stack.isEmpty()?-1:stack.peek();
    }
    
    public int getMin() {
        return st.isEmpty()?-1:st.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
