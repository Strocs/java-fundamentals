package exercices;

import java.util.Arrays;

public class Cicles {
  public static void main(String[] args) {
    System.out.println("First: " + calification(70));

    int[] arr = { 9, 50, 4 };
    System.out.println("Second: " + Arrays.toString(sort(arr)));

    System.out.println("Third:");
    nineTimesTable();

    System.out.println("Four:");
    halfTree();

    System.out.println("Fift:");
    fullTree();

    System.out.println("Six: ");
    fibonacci(10);

    System.out.println("Seven: 10 is prime? " + isPrime(10));

    System.out.println("Eigth: ");
    evens();

    System.out.println("Nine: Factorial de 5 = " + factorial(7));

    System.out.println("Ten: " + e());

  }

  public static String calification(int calification) {
    // Mostrar en consola el mensaje de "Aprobado" en caso la calificación de un
    // alumno sea mayor igual a 70, en caso contrario mostrar el mensaje
    // "Reprobado".
    if (calification <= 70)
      return "Aprobado";
    return "Reprobado";
  }

  public static int[] sort(int[] list) {
    // Dado 3 números enteros, mostrar en consola los números de forma ascendente,
    // de menor a mayor. Ejemplo Números = 9, 50, 4 Salida = 4, 9, 50
    for (int i = 1; i < list.length; i++) {
      int curr = list[i];
      int j = i - 1;
      while (j >= 0 && list[j] > curr) {
        list[j + 1] = list[j];
        j--;
      }
      list[j + 1] = curr;
    }
    return list;
  }

  public static void nineTimesTable() {
    for (int i = 1; i <= 10; i++) {
      System.out.println(String.format("9 * %d = %d", i, 9 * i));
    }
  }

  public static void halfTree() {
    for (int i = 1; i <= 6; i++) {
      System.out.println("*".repeat(i));
    }
  }

  public static void fullTree() {
    for (int i = 1; i <= 5; i++) {
      System.out.println(" ".repeat(5 - i) + "*".repeat(2 * i - 1));
    }
  }

  public static void fibonacci(int n) {
    int[] result = new int[10];
    result[0] = 0;
    result[1] = 1;

    for (int i = 2; i < n; i++) {
      result[i] = result[i - 1] + result[i - 2];
    }
    System.out.println(Arrays.toString(result));
  }

  public static boolean isPrime(int n) {
    if (n <= 1)
      return false;
    for (int i = 2; i < n; i++) {
      if (n % i == 0)
        return false;
    }
    return true;
  }

  public static void evens() {
    for (int i = 1; i < 4570; i++) {
      if (i % 2 == 0)
        System.out.println(i);
    }
  }

  public static int factorial(int n) {
    int res = 1;
    for (int i = 2; i <= n; i++) {
      res *= i;
    }
    return res;
  }

  public static float e() {
    float value = 0.0f;
    for (int i = 0; i < 10; i++) {
      value += 1 / (float) factorial(i);
    }
    return value;
  }
}
