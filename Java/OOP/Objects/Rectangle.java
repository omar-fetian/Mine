package com.MyClass;

public class Rectangle {
    private double Length, Width;
    public Rectangle(){
        Length = 10;
        Width = 20;
    }//default length and width is set with the object creation
    public Rectangle(double length, double width){
        Length = length;     Width = width;
    }//construction executed with the object creation
    public Rectangle(Rectangle src){
        this.Width = src.Width;     this.Length = src.Length;
    }
    public void setLength(double length){
        if (length > 0)     Length = length;
        else System.out.println("data rejected, negative input");
    }
    public void setWidth(double width){
        if (width > 0)     Width = width;
        else System.out.println("data rejected, negative input");
    }
    public double getLength(){
        return Length;
    }
    public double getWidth(){
        return Width;
    }
    public double getArea(){
        return Width * Length;
    }
    public static Rectangle SumOfRectangles(Rectangle a, Rectangle b){
        Rectangle sum = new Rectangle();
        sum.Width = a.Width + b.Width;
        sum.Length = a.Length + b.Length;
        return sum;
    }
    public Rectangle SumOfRectangles(Rectangle a){
        Rectangle sum = new Rectangle();
        sum.Width = a.Width + this.Width;
        sum.Length = a.Length + this.Length;
        return sum;
    }
    public static boolean isEqual(Rectangle a, Rectangle b){
        return a.Length == b.Length && a.Width == b.Width;
    }
    public void copyTo(Rectangle a){
        a.Width = this.Width;   a.Length = this.Length;
    }
    public String toString(){
        return "Room Length is " + this.Length + ", and Width is " + this.Width;
    }
}
