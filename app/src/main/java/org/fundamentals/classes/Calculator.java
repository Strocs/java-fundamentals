package org.fundamentals.classes;

public class Calculator {
  public int sum(int... values) { // n -> int Array
    int sum = 0;
    for (int number : values) {
      sum += number;
    }
    return sum;
  }

  public float sum(float... values) {
    float sum = 0;
    for (float number : values) {
      sum += number;
    }
    return sum;
  }

  public double sum(double... values) {
    double sum = 0;
    for (double number : values) {
      sum += number;
    }
    return sum;
  }
}
