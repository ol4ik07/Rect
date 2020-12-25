package com.firstproject;

public class App {
    public static void main(String[] args) {
        Rect rect1 = new Rect(5,6);
        Rect rect2 = new Rect(6, 7);
        Circle circle1 = new Circle(5);

        Calculator calc = new Calculator();
        calc.addFigure(rect1);
        calc.addFigure(rect2);
        calc.addFigure(circle1);
        calc.addFigure(new Rect(2,2));
        System.out.println(rect1.square());
        System.out.println(rect2.square());
        System.out.println(calc.figureSum());
        System.out.println(circle1.square());

    }
}
