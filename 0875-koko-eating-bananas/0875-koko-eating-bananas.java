class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxPile = Arrays.stream(piles).max().getAsInt();
        int left = 1, right = maxPile;
        int ans = maxPile;

        while (left <= right) {
            int mid = (left + right) / 2;
            long totalH = countTotalHours(piles, mid);
            if (totalH <= h) {
                ans = mid;
                right = mid - 1;
            } else
                left = mid + 1;
        }
        return ans;
    }

    public long countTotalHours(int[] a, int i) {
        long totalH = 0;
        for (int num : a) {
            totalH += (long) Math.ceil((double) num / i);
        }
        return totalH;
    }
}