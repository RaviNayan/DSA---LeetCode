class Solution {
    public int strStr(String haystack, String needle) {
        if (!haystack.contains(needle))
            return -1;
        int i = 0, j = needle.length();
        while (j <= haystack.length()) {
            if (haystack.substring(i, j).equals(needle))
                return i;
            i++;
            j++;
        }
        return -1;
    }
}