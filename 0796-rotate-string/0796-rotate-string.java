class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        String ds = s+s;
        if (ds.contains(goal)) return true;
        return false;
    }
}