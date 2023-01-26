package com.cydeo.solid.openClosed.example1.good;

public class Circle implements Shape{

    public double radius;


    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }
}
