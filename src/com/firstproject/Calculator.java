package com.firstproject;


import java.util.ArrayList;

public class Calculator {
    ArrayList<Rect> rects = new ArrayList<Rect>();
    ArrayList<Circle> circles = new ArrayList<Circle>();

    public void addRect(Rect rect) {
        rects.add(rect);

    }
    public void addCircle(Circle circle) {
        circles.add(circle);

    }

    public float sumSquares()
    {
        return rectsSum() + circlesSum();
    }

    private float rectsSum() {
        float rectsSquareSum = 0;
        for (Rect rect : rects) {

            rectsSquareSum = rectsSquareSum + rect.square();
        }
        return rectsSquareSum;
    }

    private float circlesSum() {
        float circleSquareSum = 0;
        for (Circle circle : circles) {

            circleSquareSum = circleSquareSum + circle.square();
        }
        return circleSquareSum;
    }


}
