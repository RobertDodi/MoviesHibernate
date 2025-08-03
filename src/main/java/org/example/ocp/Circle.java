package org.example.ocp;

public class Circle extends Shape{
private Double radius;

    @Override
    public Double calcArea() {
        return (radius * radius) * Math.PI;
    }
}
