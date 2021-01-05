package com.codecool.oopws2;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 5);
        rectangle.printRectangle();
    
        Rectangle roundedRectangle = new RoundedRectangle(4, 5, 3);
        roundedRectangle.printRectangle();
    }
}
