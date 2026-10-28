class Solution {
    public int titleToNumber(String columnTitle) {
        long cnum = 0;
        int len = columnTitle.length();
        int j = 0;
        for (int i = len - 1; i >= 0; i--) {
            cnum += (long) Math.pow((double) 26, (double) i) * (columnTitle.charAt(j++) - 'A' + 1);
        }
        return (int) cnum;
    }
}