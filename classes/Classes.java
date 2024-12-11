package classes;

public class Classes {
  public static void main(String[] args) {
    // Creating objects
    // herency
    Dog toti = new Dog("Toti", "Pesao", 10);
    Cat salmon = new Cat("Salmon", "Llorón", 2);

    System.out.println("The name is: " + toti.name);
    System.out.println("The breed is: " + toti.breed);
    System.out.println("The age is: " + toti.age);

    toti.bark();
    toti.eat();
    toti.sleep();

    System.out.println("The name is: " + salmon.name);
    System.out.println("The breed is: " + salmon.breed);
    System.out.println("The age is: " + salmon.age);

    salmon.meow();
    salmon.eat();
    salmon.sleep();

    // Setters, Getters and Constructor
    User strocs = new User("Strocs", "123456");
    // strocs.password = "123456"; Error bc is private

    strocs.setPassword("654321");
    strocs.hello();
    System.out.println(strocs.getPassword());

    // Methods overflow
    Calculator calculator = new Calculator();
    int integer = calculator.sum(10, 20);
    float floats = calculator.sum(1.3812f, 2.9382f);
    double doubles = calculator.sum(1.928198401, 2.23197412);
    int three = calculator.sum(10, 2, 49);
    int zero = calculator.sum();

    System.out.println(integer);
    System.out.println(floats);
    System.out.println(doubles);
    System.out.println(three);
    System.out.println(zero);

    // Static -> owns the class not the object
    System.out.println(Circle.pi);

    // nested classes
    User boss = new User("Strocs");
    boss.setRol();

    // Sustitution principle
    // two clases have an equal parent class
    Form circle = new Circle(9f);
    Form triangle = new Triangle(10f, 5f);

    Form forms[] = new Form[2];

    forms[0] = circle;
    forms[1] = triangle;

    for (Form form : forms) {
      System.out.println(form.area());
    }

  }
}
