class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        int n = nums.length;
        if (n == 0)
            return ans;
        else if (n == 1) {
            ans.add(nums[n - 1] + "");
            return ans;
        }
        int a = nums[0], b = nums[n - 1];
        int j = 1, k = 0;
        while (j < n) {
            if (nums[j] - nums[j - 1] == 1) {
                j++;
                continue;
            } else {
                if (a != nums[j - 1])
                    ans.add(a + "->" + nums[j - 1]);
                else
                    ans.add(a + "");
                a = nums[j];
            }
            j++;
        }
        if (nums[n - 1] - nums[n - 2] == 1)
            ans.add(a + "->" + nums[n - 1]);
        else
            ans.add(nums[n - 1] + "");
        return ans;
    }
}