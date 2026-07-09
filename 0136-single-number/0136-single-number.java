class Solution {
    public int singleNumber(int[] nums) {
        if (nums.length<2) return nums[0];
        int k = nums[0];
        for (int i = 1;i<nums.length;i++){
            k^=nums[i];
        }
        // if (k==nums.length-2) k++;
        return k;
    }
}