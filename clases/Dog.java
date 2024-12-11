package clases;

public class Dog extends Pet {
  public Dog(String name, String breed, int age) {
    this.name = name;
    this.breed = breed;
    this.age = age;
  }

  public void bark() {
    System.out.println(name + " say: woof!");
  }
}
