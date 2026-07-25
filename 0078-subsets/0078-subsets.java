class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        Arrays.sort(nums);
        solution(0, nums, ans, ds);
        return ans;
    }

    public void solution(int ind, int[] nums, List<List<Integer>> ans, List<Integer> ds){
        
        ans.add(new ArrayList<>(ds));
        for (int i = ind; i<nums.length;i++){
            if (i>ind && nums[i]==nums[i-1]) continue;

            ds.add(nums[i]);
            solution(i+1, nums, ans, ds);
            ds.remove(ds.size()-1);
        }
            
            
    }
}