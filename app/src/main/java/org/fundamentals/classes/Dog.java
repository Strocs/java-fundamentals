package org.fundamentals.classes;

public class Dog extends Pet {

  public Dog(String name, String breed, int age) {
    super(name, breed, age); // generate a constructor on parent class and in the constructor of child use
                             // the super method to call that constructor
  }

  public void bark() {
    System.out.println(name + " say: woof!");
  }
}
