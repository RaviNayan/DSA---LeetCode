class Solution {
    public int[] prevPermOpt1(int[] arr) {
          int maxIndex = 0;
    boolean found = false;
    for (int i = arr.length - 2; i >= 0; i--) {
      if (arr[i] > arr[i + 1]) {
        maxIndex = i;
        found = true;
        break;
      }
    }
    if (found == false)
      return arr;
    int min2 = arr[maxIndex];
    for (int i = arr.length - 1; i > maxIndex; i--) {
      if (arr[i] < min2) {
        min2 = i;
        break;
      }
    }
    for (int i = min2; i > maxIndex; i--) {
      if (arr[i] == arr[min2])
        min2 = i;
    }
    swap(arr, maxIndex, min2);
    return arr;
  }

  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
    }
