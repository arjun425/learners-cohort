package com.oops;

public class Triangle implements Shape {
    @Override
    public String getArea() {
        return "Area of Triangle";
    }

    @Override
    public String getPerimeter() {
        return "Perimeter of Triangle";
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public void setShapeName(String shapeName) {

    }
}
