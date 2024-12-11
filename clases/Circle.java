package clases;

public class Circle {
  public static final double pi = Math.PI;
  public float radio = 0f;

  public Circle(float radio) {
    this.radio = radio;
  }

  public double area() {
    return Circle.pi * (radio * radio);
  }

}
