class Solution {
    public int smallestDivisor(int[] arr, int limit) {
        int min = 1, max = Integer.MIN_VALUE;

        for (int i : arr) {
            max = Math.max(max, i);
        }

        while (min <= max) {
            int mid = min + (max - min) / 2;
            if (remainder(arr, mid) > limit) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return min;
    }

    public static int remainder(int[] arr, int mid) {
        int sum = 0;
        for (int num : arr) {
            sum += (num+mid-1)/mid;
        }
        return sum;
    }
}