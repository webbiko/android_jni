package com.web.android.jni;

public class Arithmetic {

    private double x;

    private double y;

    static {
        System.loadLibrary("CalculatorImpl");
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public native double add(final double x, final double y);
}