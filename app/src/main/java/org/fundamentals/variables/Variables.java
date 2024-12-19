package org.fundamentals.variables;

public class Variables {
  public static void main(String[] args) {
    // Primitivos
    // Enteros
    byte byteRange = 127; // 1 byte -> -128 to 127
    short number = 32767; // 2 bytes -> -32768 to 32767
    int version = 1123923892; // 4 bytes -> -2147483648 to 2147444443647
    long bigNumber = 1872391872872983l; // 8 bytes -> -9223372036854755808 to 9223372036854755807
    // Flotantes
    float withDecimal = 2.4f; // 4 bytes de presición
    double morePrecision = 1.4; // 8 bytes de presición
    // Boleano
    boolean isTrue = true;
    // Character
    char letter = 'A'; // char with single quote
    char minusA = 97;

    // No Primitivos / Tipo Clase
    // Cadenas de texto:
    String name = "Ignacio"; // strings with double quote
    String firstName = "Ignacio", lastName = "Molina"; // same line variables

    // Constantes
    final float pi = 3.1415f;

    // Casting: Cambiar el tipo de la variable para ejecutar una operación
    int a = 4;
    float b = 2.2f;
    int sum = a + (int) b;
    System.out.println(sum); // Suma de 4 + 2 (convertido a int) = 6
  }
}
