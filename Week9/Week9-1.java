class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int maxcount=1;
        int count=1;
        int val=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }else{
                count=1;
            }
            if(count>maxcount){
                maxcount=count;
                val=nums[i];
            }
        }
        return val;
    }
}
