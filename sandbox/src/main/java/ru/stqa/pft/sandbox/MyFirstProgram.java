package ru.stqa.pft.sandbox;

public class MyFirstProgram {
  public static void main(String[] args) {

    hello("World");
    hello("Alexandr");

    Square s=new Square(3);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    Rectangle r=new Rectangle(7.0/3,8);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + ", "+r.b+ " = " + r.area());
  }

  public  static void hello(String somebody) {

    System.out.println("Hello, " + somebody + " !");
  }


}