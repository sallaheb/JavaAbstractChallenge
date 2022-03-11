package com.nology;

public class Rectangle extends Shape {

    public int Base;
    public int height;

    public Rectangle() {
        super("rectangle", 4);
    }

    public Rectangle(int base, int height) {
        super("rectangle", 4);
        Base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        Integer area = this.Base*this.height;
        System.out.println("I am a " + getNameOfShape() + " and I have" + getNumberOfSides()+ " sides, with an area of " + area);
        return area;
    }

    @Override
    public double getPerimeter() {

        Integer perimeter = 4*getNumberOfSides();
        System.out.println("I am a" + getNameOfShape() + "and I have" + getNumberOfSides()+ "sides, with a perimeter of" + perimeter);

        return perimeter;
    }
}
