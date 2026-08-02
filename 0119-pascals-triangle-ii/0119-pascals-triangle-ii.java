class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        int n = rowIndex+1;
        long val=1;
        row.add((int)val);
        for (int k = 1;k<n;k++){
            val = val*(n-k)/k;
            row.add((int)val);
        }
        return row;
    }
}