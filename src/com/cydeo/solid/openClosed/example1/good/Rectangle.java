package com.cydeo.solid.openClosed.example1.good;

public class Rectangle implements Shape{

    public double length, width;



    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
    }
}
