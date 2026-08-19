class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int min = Integer.MIN_VALUE, max = 0;
        for (int i : weights) {
            min = Math.max(i, min);
            max += i;
        }

        while (min <= max) {
            int mid = min + (max - min) / 2;
            if (test(weights, mid) > days) {
                min = mid + 1;
            } else
                max = mid - 1;
        }
        return min;
    }

    public static int test(int[] arr, int mid) {
        int days = 0;
        int check = mid;
        for (int i : arr) {
            check -= i;
            if (check < 0) {
                check = mid - i;
                days++;
            }
        }
        if (check>=0 && check<mid) return days+1;
        return days;
    }
}
