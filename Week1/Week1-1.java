class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int l=0,r=n-1,k=n-1;
        int[] a=new int[n];
        while(l<=r){
            if(Math.abs(nums[l])>Math.abs(nums[r])){
                a[k--]=nums[l]*nums[l];
                l++;
            }
            else{
                a[k--]=nums[r]*nums[r];
                r--;
            }
        }
        return a;
    }
}
