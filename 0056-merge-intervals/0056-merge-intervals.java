class Solution {
    public int[][] merge(int[][] intervals) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = intervals.length;
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        for (int[] interval : intervals){
            if (ans.isEmpty() || ans.get(ans.size()-1).get(1)<interval[0]){
                ans.add(Arrays.asList(interval[0], interval[1]));
            } else {
                int last= ans.size()-1;
                int maxLen= Math.max(interval[1], ans.get(last).get(1));
                ans.get(last).set(1, maxLen);
            }
            
        }
        int[][] merged = new int[ans.size()][2];
        int i = 0;
        for (List<Integer> num : ans){
            merged[i][0] = num.get(0);
            merged[i][1] = num.get(1);
            i++;
        }
        return merged;

    }
}