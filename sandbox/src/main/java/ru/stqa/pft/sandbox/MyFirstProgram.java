package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {

    hello("Alex");
    double l =3;
    System.out.println("Площадь квадрата со стороной "+l+" = "+area(l));
    double a=4;
    double b=6;
    System.out.println("Площадь прямоугольника со сторонами "+a+", "+b+" = "+area(a,b));
  }

  public static void hello(String s) {
    System.out.println("Hello, " + s + " !");
  }
  public static double area(double l){
    return l*l;
  }
  public static double area(double a,double b){
    return a*b;
  }
}