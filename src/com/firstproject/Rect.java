package com.firstproject;

public class Rect implements Figure {
    private final float x;
    private final float y;

    public Rect(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float square() {

        return this.x * this.y;
    }

}
