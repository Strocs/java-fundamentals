package org.fundamentals.classes;

public class Pet {

  public String name;
  public String breed;
  public int age;

  public Pet(String name, String breed, int age) {
    this.name = name;
    this.breed = breed;
    this.age = age;
  }

  public void eat() {
    System.out.println(this.name + " is eating");
  }

  public void sleep() {
    System.out.println(this.name + " is sleeping");
  }

}
