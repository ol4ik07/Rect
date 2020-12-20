package com.firstproject;

public class App {
    public static void main(String[] args) {
        Rect rect1 = new Rect(5,6);
        Rect rect2 = new Rect(6, 7);
        Circle circle1 = new Circle(5);

        Calculator calc = new Calculator();
        calc.addRect(rect1);
        calc.addRect(rect2);
        calc.addCircle(circle1);
        calc.addRect(new Rect(2,2));
        System.out.println(rect1.square());
        System.out.println(rect2.square());
        System.out.println(calc.sumSquares());
        System.out.println(circle1.square());

    }
}
