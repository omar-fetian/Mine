package com.MyClass;

import java.util.Scanner;

public class Rectangle {
    private double length, width;
    Scanner in = new Scanner(System.in);
    public Rectangle(){
        length = 10;
        width = 20;
        System.out.println("a new room is created with length "+length +" and width "+width);
    }
    public Rectangle(double l, double w){
        length = l;     width = w;
        System.out.println("a new room is created with length "+length +" and width "+width);
    }//construction executed with the object creation
    public void setLength(double L){
        if (L > 0)     length = L;
    }
    public void setWidth(double W){
        if (W > 0)     width = W;
    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public double getArea(){
        return width * length;
    }
}
