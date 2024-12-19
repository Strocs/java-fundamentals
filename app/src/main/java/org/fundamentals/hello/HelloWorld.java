package org.fundamentals.hello;

// Todo fragmento de código en java está contenido dentro de una clase
class HelloWorld {
  // Todo lo que se contenga dentro del método main será ejecutado
  public static void main(String[] args) {
    printHello("World!\n");
    int x = 1;
    int y = 2;
    System.out.println("Sum of " + x + " and " + y + " is equal to: " + sum(x, y));
  };

  public static void printHello(String msg) {
    System.out.println("Hello, " + msg);
  };

  public static int sum(int x, int y) {
    return x + y;
  }
}
