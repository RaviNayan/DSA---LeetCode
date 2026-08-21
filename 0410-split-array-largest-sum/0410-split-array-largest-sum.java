class Solution {
    public int splitArray(int[] nums, int k) {
        int min = Integer.MIN_VALUE, max = 0;
        for (int i : nums) {
            min = Math.max(min, i);
            max += i;
        }

        while (min <= max) {
            int mid = min + (max - min) / 2;
            int partition = countPartition(nums, mid);

            if (partition > k)
                min = mid + 1;
            else
                max = mid - 1;
        }

        return min;
    }

    public int countPartition(int[] nums, int sum) {
        int partition = 1;
        int subArraySum = 0;
        for (int i : nums) {
            if (subArraySum + i <= sum) {
                subArraySum += i;
            } else {
                partition++;
                subArraySum = i;
            }
        }
        return partition;
    }
}