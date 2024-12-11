package exercices;

import java.util.Arrays;

public class Array {
  public static void main(String[] args) {
    int[] arr = randomList(101);

    System.out.println("Mayor: " + arr[arr.length - 1]);
    System.out.println("Menor: " + arr[0]);

    System.out.println("List of primes: ");
    showPrimes(arr);

    System.out.println("List of evens: ");
    showEvens(arr);

    System.out.println("ASC List:");
    System.out.println(Arrays.toString(arr));

    System.out.println("Sum of First and Last: " + (arr[0] + arr[arr.length - 1]));

    haveThousand(arr);

    System.out.println("Avarage: " + avarage(arr));
  }

  public static int[] randomList(int n) {
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = (int) (Math.random() * n);
    }
    return insertionSort(arr);
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

  public static void showPrimes(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      if (Cicles.isPrime(arr[i])) {
        System.out.println(arr[i]);
      }
    }
  }

  public static float avarage(int[] arr) {
    int sum = 0;
    for (int value : arr) {
      sum += value;
    }
    return sum / arr.length;
  }

  public static void showEvens(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 == 0) {
        System.out.println(arr[i]);
      }
    }
  }

  public static void haveThousand(int[] arr) {
    for (int value : arr) {
      if (value == 100) {
        System.out.println("Existe cien");
      }
    }
  }

}
