
package clases;

public class Cat extends Pet {
  public Cat(String name, String breed, int age) {
    this.name = name;
    this.breed = breed;
    this.age = age;
  }

  public void meow() {
    System.out.println(name + " say: meow!");
  }
}
