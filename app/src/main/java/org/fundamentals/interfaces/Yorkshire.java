package org.fundamentals.interfaces;

public class Yorkshire implements Canine, Animal {

  @Override
  public void howl() {
    System.out.println("This little Yorkshire Howls");
  }
}
