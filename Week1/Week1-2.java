import java.util.*;
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<n;i++){
            if(h.contains(nums[i])){
                return true;
            }
            h.add(nums[i]);
            if(h.size()>k){
                h.remove(nums[i-k]);
            }
        }
        return false;
    }
} 
