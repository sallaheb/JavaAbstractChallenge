package com.nology;

public class Circle extends Shape{

    public int Pi;
    public int radius;

    public Circle() {
        super("circle", 0);
    }

    public Circle(int pi, int radius) {
        super("circle", 0);
        Pi = pi;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double area = this.Pi*(this.radius*this.radius);
        System.out.println("I am a " + getNameOfShape() + " and I have" + getNumberOfSides()+ " sides, with an area of " + area);
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2*this.Pi*(this.radius);
        System.out.println("I am a" + getNameOfShape() + "and I have" + getNumberOfSides()+ "sides, with a perimeter of" + perimeter);
        return perimeter;
    }
}
