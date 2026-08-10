class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        findCombination(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }

    public void findCombination(int i, int[] arr, int target, List<List<Integer>> ans, ArrayList<Integer> ds){
        if (target==0){
            ans.add(new ArrayList<>(ds));
            return; 
        }

        for (int x = i; x<arr.length; x++){
            if (x>i && arr[x] == arr[x-1]) continue;
            if (arr[x]>target) break;

            ds.add(arr[x]);
            findCombination(x+1, arr, target-arr[x], ans, ds);
            ds.remove(ds.size()-1);
        }
    }
}