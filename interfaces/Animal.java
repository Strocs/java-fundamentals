package interfaces;

public interface Animal {
  public default void feed() { // default method, define what and how
    System.out.println("Feeding the pet");
  }
}
