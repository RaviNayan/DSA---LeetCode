class Solution {
    public int maxSubArray(int[] nums) {
        //Kadane's Algorithm
        long sum = 0, max = Long.MIN_VALUE;
        for (int i = 0;i<nums.length;i++){
            sum += nums[i];

            if (sum>max){
                max = sum;
            }
            if (sum<0){
                sum = 0;
            }
        }
        return (int)max;
    }
}