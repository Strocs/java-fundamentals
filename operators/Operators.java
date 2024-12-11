package operators;

class Operators {
  public static void main(String[] args) {
    System.out.println("Aritméticos");
    aritmeticos(4, 2);
    System.out.println("\nRelacionales");
    relacionales(4, 2);
    System.out.println("\nLogicos");
    logicos(true, false);
  }

  public static void aritmeticos(int a, int b) {
    System.out.println("Suma: " + a + "+" + b + " = " + (a + b));
    System.out.println("Resta: " + a + "-" + b + " = " + (a - b));
    System.out.println("Multiplicacion: " + a + "*" + b + " = " + (a * b));
    System.out.println("Division: " + a + "/" + b + " = " + (a / b));
    System.out.println("Modulo: " + a + "%" + b + " = " + (a % b));
    System.out.println("Incremento: " + "++" + a + " = " + (++a));
    System.out.println("Decremento: " + "--" + a + " = " + (--a));
  }

  public static void relacionales(int a, int b) {
    System.out.println("Menor que: " + a + "<" + b + " = " + (a < b));
    System.out.println("Mayor que: " + a + ">" + b + " = " + (a > b));
    System.out.println("Igual que: " + a + "==" + b + " = " + (a == b));
    System.out.println("Distinto: " + a + "!=" + b + " = " + (a != b));
    System.out.println("Mayor igual que: " + a + ">=" + b + " = " + (a >= b));
    System.out.println("Menor igual que: " + a + "<=" + b + " = " + (a <= b));
  }

  public static void logicos(boolean a, boolean b) {
    System.out.println("AND: " + a + "&&" + b + " = " + (a && b));
    System.out.println("OR: " + a + "||" + b + " = " + (a || b));
    System.out.println("NOT: " + a + "!" + " = " + (!a));
    System.out.println("XOR: " + a + "^" + b + " = " + (a ^ b));
    // System.out.println("Implicacion" + a + "->" + b + " = " + (a -> b));
  }
}
