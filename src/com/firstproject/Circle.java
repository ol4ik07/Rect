package com.firstproject;

public class Circle implements Figure {
    private final float r;


    public Circle(float r) {
        this.r = r;
    }

    public float square() {

        return (float) (Math.pow(this.r, 2) * Math.PI);
    }


}
