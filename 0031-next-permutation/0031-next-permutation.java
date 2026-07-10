class Solution {
    public void nextPermutation(int[] arr) {
        int min2 = Integer.MAX_VALUE, minIndex = 0;
        boolean found = false;
        // finding arr[i]<arr[i+1] and assigning it to min2
        for (int x = arr.length - 2; x >= 0; x--) {
            if (arr[x] < arr[x + 1]) {
                minIndex = x;
                found = true;
                break;
            }
        }
        // if no such mumber is found, meaning the arr is sorted in decreasing order
        // (last in lexicographical order)
        if (found == false) {
            reverse(arr, 0, arr.length - 1);
            return;
        }

        // finding number greater than min2
        for (int a = arr.length - 1; a > minIndex; a--) {
            if (arr[a] > arr[minIndex]) {
                min2 = a;
                break;
            }
        }
        swap(arr, minIndex, min2);
        reverse(arr, minIndex + 1, arr.length - 1);
        return;

    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

}