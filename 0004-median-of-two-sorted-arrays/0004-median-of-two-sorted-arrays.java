class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
          if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length, n = nums2.length;
        int total = m + n;
        int half = (total + 1) / 2;

        int left = 0, right = m;
        while (left <= right) {
            int i = (left + right) / 2;   
            int j = half - i;             

            int Aleft  = (i > 0) ? nums1[i - 1] : Integer.MIN_VALUE;
            int Aright = (i < m) ? nums1[i]     : Integer.MAX_VALUE;
            int Bleft  = (j > 0) ? nums2[j - 1] : Integer.MIN_VALUE;
            int Bright = (j < n) ? nums2[j]     : Integer.MAX_VALUE;

            if (Aleft <= Bright && Bleft <= Aright) {
                if (total % 2 == 1) {
                    return Math.max(Aleft, Bleft); 
                } else {
                    double d = Math.max(Aleft, Bleft) + Math.min(Aright, Bright);
                    return (d/2);
                }
            } else if (Aleft > Bright) {
                right = i - 1; 
            } else {
                left = i + 1;  
            }
        }
        return 0.0;
    }
}