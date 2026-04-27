class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        for(int n:asteroids){
            while(!stack.isEmpty()&&stack.peek()>0&&n<0&&stack.peek()<Math.abs(n)){
                stack.pop();
            }
            if(!stack.isEmpty()&&stack.peek()>0&&n<0&&stack.peek()==Math.abs(n)){
                stack.pop();
            }else if(stack.isEmpty()||n>0||stack.peek()<0){
                stack.push(n);
            }
        }
       int[] ans=new int[stack.size()];
        for(int i=ans.length-1;i>=0;i--) {
            ans[i]=stack.pop();
        }
        return ans;
    }
}
