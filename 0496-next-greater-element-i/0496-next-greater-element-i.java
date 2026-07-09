class Solution {
    public int[] nextGreaterElement(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0, k=0;
        int[] num = new int[arr1.length];
        while (i < arr1.length && j <= arr2.length) {
            if (j >= arr2.length - 1) {
                num[i] = -1;
                j = 0;
                i+=1;
                k=0;
                continue;
            }
            if ((arr1[i] != arr2[j]) && (k==0)) {
                j++;
                continue;
            }
            if(arr1[i]==arr2[j]) k = 1;
            if (j >= arr2.length - 1) {
                num[i] = -1;
                i++;
                j = 0;
                k=0;
                continue;
            } else if (arr2[j+1] > arr1[i]) {
                num[i] = arr2[j+1];
                i++;
                j = 0;
                k=0;
                continue;
            } else if (arr2[j+1] <= arr1[i]) {
                j++;
                continue;
            }
        }
        return num;       
    }
}