class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(nums1[i]==nums2[j]){
                    ans[i]=findnextmax(nums2,j,m);
                    break;
                }
            }
        }
        return ans;
    }
    public int findnextmax(int[] arr,int j,int m){
        for(int i=j+1;i<m;i++){
            if(arr[i]>arr[j]){
                return arr[i];
            }
        }
        return -1;
    }
}
