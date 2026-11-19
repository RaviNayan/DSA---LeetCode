class Solution {
    public int[] diStringMatch(String s) {
        int[] arr1 = new int[s.length() + 1];
        int[] arr = new int[s.length() + 1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i;
        }
        int j = 0, k = arr1.length - 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                arr[i] = arr1[j++];
            } else {
                arr[i] = arr1[k--];
            }
        }
        if (s.charAt(s.length() - 1) == 'I')
            arr[arr.length - 1] = arr1[j];
        else
            arr[arr.length - 1] = arr1[k];
        return arr;
    }
}