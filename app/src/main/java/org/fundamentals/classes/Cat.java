package org.fundamentals.classes;

public class Cat extends Pet {

  public Cat(String name, String breed, int age) {
    super(name, breed, age);
  }

  @Override // good practice for overrides methods
  public void sleep() {
    super.sleep(); // Reference to parent class
    System.out.println("The beautiful " + name + " is sleeping");
  }

  public void meow() {
    System.out.println(name + " say: meow!");
  }
}
