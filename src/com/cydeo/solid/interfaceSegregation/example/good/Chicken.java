package com.cydeo.solid.interfaceSegregation.example.good;

public class Chicken implements CanWalk ,CanEat{
    @Override
    public void eat() {
        System.out.println("Eating.");
    }

    @Override
    public void walk() {
        System.out.println("Walking.");
    }
}
