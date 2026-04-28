class Solution {
    public boolean isHappy(int n) {
        int ans=0;
        while(n>0){
            int r=n%10;
            ans+=r*r;
            n/=10;
        }
        if(ans==1) return true;
        else if(ans==4) return false;
        return isHappy(ans);
    }
}
