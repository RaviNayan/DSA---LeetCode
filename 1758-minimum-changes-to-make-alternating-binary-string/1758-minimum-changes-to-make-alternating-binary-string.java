class Solution {
    public int minOperations(String s) {
        int n = s.length();
        int misA = 0, misB = 0; // A: start '0', B: start '1'
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            char patA = (i % 2 == 0) ? '0' : '1';
            char patB = (i % 2 == 0) ? '1' : '0';
            if (c != patA) misA++;
            if (c != patB) misB++;
        }
        return Math.min(misA, misB);
    }
}