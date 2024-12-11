package algorithms;

import java.util.Arrays;

class Sort {
  public static void main(String[] args) {
    int[] array = parse.args(args);
    int[] array1 = parse.args(args);
    int[] bubble = bubbleSort(array);
    int[] insertion = insertionSort(array1);
    System.out.println(Arrays.toString(bubble));
    System.out.println(Arrays.toString(insertion));
  }

  public static int[] bubbleSort(int[] arr) {
    boolean swap;
    int iter = 0;

    do {
      swap = false;
      for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] > arr[i + 1]) {
          int temp = arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = temp;
          swap = true;
          iter++;
        }
        iter++;
      }
    } while (swap);

    System.out.println(String.format("On bubbleSort: %d", iter));
    return arr;
  }

  public static int[] insertionSort(int[] arr) {
    int iter = 0;

    for (int i = 1; i < arr.length; i++) {
      int curr = arr[i];
      int j = i - 1;

      while (j >= 0 && arr[j] > curr) {
        arr[j + 1] = arr[j];
        j--;
        iter++;
      }
      arr[j + 1] = curr;
      iter++;
    }

    System.out.println(String.format("On insertionSort: %d", iter));
    return arr;
  }
}
