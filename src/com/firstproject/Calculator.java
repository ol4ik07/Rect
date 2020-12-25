package com.firstproject;


import java.util.ArrayList;

public class Calculator{
    ArrayList<Figure> figures = new ArrayList<Figure>();

    public void addFigure(Figure figure) {
        figures.add(figure);
    }

    public float figureSum() {
        float figureSquareSum = 0;
        for (Figure figure : figures) {

            figureSquareSum = figureSquareSum + figure.square();
        }
        return figureSquareSum;
    }
}
