package org.example.ocp;

public class Square extends Shape{
    private Double width;
    private Double length;

    public Double calcArea()
    {
        return width*length;
    }
}
