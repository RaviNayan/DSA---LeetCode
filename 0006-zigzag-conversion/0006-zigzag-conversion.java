class Solution {
    public String convert(String s, int numRows) {
        if (numRows==1) return s;
        StringBuilder[] arr = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            arr[i] = new StringBuilder();
        }
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            arr[k].append(s.charAt(i));
            k = ((i / (numRows-1)) % 2 == 0) ? k + 1 : k - 1;
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            ans.append(arr[i]);
        }
        return ans.toString();
    }
}