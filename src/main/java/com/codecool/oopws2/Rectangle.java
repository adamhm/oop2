package com.codecool.oopws2;

public class Rectangle {
    private final int height;
    private final int width;
    private int size;
    
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    public Rectangle(int width, int height, int size) {
        this(width, height);
        this.size = size;
    }
    
    public int getHeight() {
        return height;
    }
    
    public int getWidth() {
        return width;
    }
    
    public double calculateArea() {
        return width * height;
    }
    
    public void printRectangle() {
        System.out.println(toString());
    }
    
    @Override
    public String toString() {
        return String.format("Width: %s, height: %s", width, height);
    }
}
