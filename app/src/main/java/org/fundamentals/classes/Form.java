package org.fundamentals.classes;

public abstract class Form { // declaring an abstract method transform the class in an abstract class
  private int sides;

  public Form() {
    this.sides = 0;
  }

  public int getSides() {
    return this.sides;
  }

  public abstract float area(); // define an abstract method that not implement how to do, only what
}
