package algorithms;

import java.util.Arrays;

class bubbleSort {
  public static void main(String[] args) {
    int[] array = parseArgs(args);
    int[] result = bubble(array);
    System.out.println(Arrays.toString(result));
  }

  public static int[] bubble(int[] arr) {
    boolean swap = true;
    while (swap) {
      swap = false;
      for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] > arr[i + 1]) {
          int temp = arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = temp;
          swap = true;
        }
      }
    }
    return arr;
  }

  public static int[] parseArgs(String[] args) {
    int[] result = new int[args.length];
    for (int i = 0; i < args.length; i++) {
      result[i] = Integer.parseInt(args[i]);
    }
    return result;
  }
}
