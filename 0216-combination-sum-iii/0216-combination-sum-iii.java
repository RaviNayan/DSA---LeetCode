class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(k, n, 1, new ArrayList<>(), ans);
        return ans;
    }

    public void solve(int k, int n, int last, List<Integer> ds, List<List<Integer>> ans) {

        if (ds.size() == k) {
            if (n == 0)
                ans.add(new ArrayList<>(ds));
            return;
        }
        if (last == 10 || n < 0)
            return;

        ds.add(last);
        solve(k, n - last, last + 1, ds, ans);
        ds.remove(ds.size() - 1);

        solve(k, n, last + 1, ds, ans);
    }
}
