class Solution {
    public int reverseBits(int n) {
        int ans=0;
        for(int i=0;i<32;i++){
            int r=n%2;
            ans=ans*2+r;
            n/=2;
        }
        return ans;
    }
}
