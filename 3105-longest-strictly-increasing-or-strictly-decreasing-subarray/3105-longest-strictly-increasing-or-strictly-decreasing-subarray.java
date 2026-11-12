class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc = 0, dec = 0;
        int maxi = 1, maxd = 1;
        for (int right = 1;right<nums.length;right++){
            if(nums[right]>nums[right-1]){
                maxi = Math.max(maxi, right-inc+1);
                dec = right;
            }
            else if (nums[right]<nums[right-1]){
                maxd = Math.max(maxd, right-dec+1);
                inc = right;
            }
            else{
                inc = right;
                dec = right;
            }
        }
        return Math.max(maxi, maxd);
    }
}