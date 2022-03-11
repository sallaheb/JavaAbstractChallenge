package com.nology;

public class Triangle extends Shape{

    public int BaseSide;
    public int height;
    public int sideA;
    public int sideB;

    public Triangle() {
        super("triangle", 3);
    }

    public Triangle(int baseSide, int height, int sideA, int sideB) {
        super("triangle", 3);
        this.BaseSide = baseSide;
        this.height = height;
        this.sideA = sideA;
        this.sideB=sideB;
    }

    @Override
    public double getArea() {
        double area = 0.5*(this.BaseSide*this.height);
        System.out.println("I am a " + getNameOfShape() + " and I have" + getNumberOfSides()+ " sides, with an area of " + area);
        return area;
    }

    @Override
    public double getPerimeter() {
        Integer perimeter = this.BaseSide+this.sideB+this.sideA;
        System.out.println("I am a" + getNameOfShape() + "and I have" + getNumberOfSides()+ "sides, with a perimeter of" + perimeter);

        return perimeter;
    }
}
