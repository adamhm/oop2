package com.codecool.oopws2;

public class RoundedRectangle extends Rectangle {
    private final int roundRadius;
    
    public RoundedRectangle(int width, int height) {
        super(width, height);
        this.roundRadius = 2;
    }
    
    public RoundedRectangle(int width, int height, int roundRadius) {
        super(width, height);
        this.roundRadius = roundRadius;
    }
    
    public int getRoundRadius() {
        return roundRadius;
    }
    
    @Override
    public double calculateArea() {
        return super.calculateArea() - 4 * (getRoundRadius() * getRoundRadius()) + getRoundRadius() * getRoundRadius() * Math.PI;
    }
    
    public String toString() {
        return String.format("Width: %s, height: %s, radius: %s", getWidth(), getHeight(), roundRadius);
    }
}
