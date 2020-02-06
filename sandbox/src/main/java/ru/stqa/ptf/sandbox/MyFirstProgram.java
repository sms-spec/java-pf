package ru.stqa.ptf.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello (" world");
    hello (" user");
    hello (" Liliia");

    Square s = new Square (5);
    System.out.println("Площадь квадрата со стороной " + s.l + "=" + s.area());

    Rectangle r = new Rectangle (4,6);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + "=" + r.area());
  }

  public static void hello(String sambody) {
    System.out.println("Hello," + sambody + " !");
  }

  public static double area(Square s) {
    return s.l * s.l;
  }

}
