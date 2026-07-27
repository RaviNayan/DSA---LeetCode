class Solution {
    public int maxProduct(int[] nums) {
        int min1= Integer.MAX_VALUE, min2=Integer.MAX_VALUE;
        int max1=Integer.MIN_VALUE, max2=Integer.MIN_VALUE;

        for(int num:nums){
            if (num>max1){
                max2=max1;
                max1=num;
            }
            else if(num>max2){
                max2=num;
            }
            if(num<min1){
                min2=min1;
                min1=num;
            }
            else if(num<min2){
                min2=num;
            }
        }
        min1-=1;
        min2-=1;
        max1-=1;
        max2-=1;
        return Math.max(min1*min2,max1*max2);
    }
}