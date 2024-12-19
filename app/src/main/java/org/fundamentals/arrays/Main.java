package org.fundamentals.arrays;

public class Arrays {
  public static void main(String[] args) {
    // for each
    int[] values = { 1, 2, 3, 4, 5 };
    int sum = 0;
    for (int value : values) {
      // cant modify the value;
      sum += value;
    }
    System.out.println(sum);
  }
}
