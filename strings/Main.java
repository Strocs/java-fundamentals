package strings;

public class Main {
  public static void main(String[] args) {
    // string -> clase
    String msg = " Soy un String ";
    // Métodos
    String upper = msg.toUpperCase();
    String lower = msg.toLowerCase();
    String trim = msg.trim();
    String concat = msg.concat(", concatenado");

    System.out.println(msg);
    System.out.println(upper);
    System.out.println(lower);
    System.out.println(trim);
    System.out.println(concat);

    // Concatenado - format
    String coin = "USD";
    int articles = 3;
    float value = 3.25f;

    // String result = String.format("El total %d articulos es: $%.2f %s", articles,
    // value, coin);
    // System.out.println(result);
    System.out.printf("El total %d articulos es: $%.2f %s", articles, value, coin);
    System.out.println('\n');
    System.out.printf("El total %3$d articulos es: $%1$.2f %2$s", value, coin, articles);
    System.out.println('\n');

    String course = "Java";
    String name = "Ignacio";
    String msg2 = "Hola, Bienvenido " + name + ", estás en el curso de " + course + '.';
    System.out.println(msg2);
    String msg3 = "El total de " + articles + " articuls es: " + value + " " + coin;
    System.out.println(msg3);

    // Comparar cadenas
    String s1 = "Hola";
    String s2 = "Hola";
    boolean result = s2.equals(s1);
    boolean comparative = s1 == s2;
    System.out.println(result);
    System.out.println(comparative);

    String s3 = "hola";
    String s4 = "HolA";

    boolean result2 = s3.equalsIgnoreCase(s4);
    System.out.println(result2);
  }
}
