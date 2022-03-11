package com.nology;

public abstract class Shape {
    String nameOfShape;
    int numberOfSides;

    public Shape(String nameOfShape, int numberOfSides) {
        this.nameOfShape = nameOfShape;
        this.numberOfSides = numberOfSides;
    }

    public String getNameOfShape() {
        return nameOfShape;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public abstract double getArea();
    public abstract double getPerimeter();


}
