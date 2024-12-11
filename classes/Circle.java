package classes;

public class Circle extends Form {
  public static final double pi = Math.PI;
  public float radio = 0f;

  public Circle(float radio) {
    this.radio = radio;
  }

  @Override
  public float area() {
    return (float) Circle.pi * (radio * radio);
  }

}
