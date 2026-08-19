class Solution {
    public int isPossible(int[] bloomDays, int day, int k) {
        int count = 0;
        int bouquets = 0;

        for (int bloom : bloomDays) {
            if (bloom <= day) {
                count++;
            } else {
                bouquets += count/k;
                count = 0;
            }
        }
        bouquets += count/k;
        return bouquets;
    }

    public int minDays(int[] bloomDays, int m, int k) {
        long totalFlowers = (long) m * k;
        if (totalFlowers > bloomDays.length)
            return -1;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int bloom:bloomDays){
            min = Math.min(min, bloom);
            max = Math.max(max, bloom);
        }
        int ans = -1;
        while (min<=max){
            int mid = min+(max-min)/2;
            if ((isPossible(bloomDays, mid, k))>=m) {
                ans = mid;
                max = mid-1;
            }
            else min = mid+1;
        }

        return ans;
    }
}