class Solution {
    public int jump(int[] nums) {
        int jumps = 0, l = 0, r = 0, n = nums.length;
        while (r < n - 1) {
            int farthest = 0;
            for (int i = l; i <= r; i++) {
                farthest = Math.max(i + nums[i], farthest);
            }
            l = r + 1;
            jumps = jumps + 1;
            r = farthest;
        }
        return jumps;
    }
}