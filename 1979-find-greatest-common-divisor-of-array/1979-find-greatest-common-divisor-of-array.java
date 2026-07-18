class Solution {
    public int findGCD(int[] nums) {
        int n = nums.length;
        int smallest = nums[0], largest = nums[0];
        for (int i = 0;i<n;i++){
            if (nums[i]<smallest) smallest = nums[i];
            if (nums[i]>largest) largest = nums[i];
        }
        return gcd(smallest, largest);
    }

    public int gcd(int num1, int num2){
        int mn = Math.min(num1, num2);
        int g = 1;
        for (int i = 2; i<=mn;i++){
            if (num1%i==0 && num2%i==0) g=i;
        }
        return g;
    }
}