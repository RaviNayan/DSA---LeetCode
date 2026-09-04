class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        brackets(n, "", 0, 0, ans);
        return ans;
    }

    public static void brackets(int n, String s, int open, int close, List<String> ans) {
        if (s.length() == 2 * n) {
            ans.add(s);
            return;
        }

        if (open < n)
            brackets(n, s + "(", open + 1, close, ans);
        if (close < open)
            brackets(n, s + ")", open, close + 1, ans);
    }
}