package com.oops;

public class Rectangle implements Shape{

    private double length;
    private double breadth;
    private String shapeName;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Rectangle(){
        this.length = 0;
        this.breadth = 0;
    }

    @Override
    public String getArea() {
        return "length * breadth";
    }

    @Override
    public String getPerimeter() {
        return "2 * (length + breadth)";
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }
}
