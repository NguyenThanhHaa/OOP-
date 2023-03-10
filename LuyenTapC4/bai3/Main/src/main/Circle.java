/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author thanh ha
 */
public class Circle extends Shape
{
    private double radius=1.0;
    final double PI=3.14;
    
    public Circle()
    {
        
    }
    
    public Circle(double radius)
    {
        
    }
    
    public Circle(double radius, String color, boolean filled)
    {
        super (color,filled);
        setRadius(radius);
    }
    
    private void setRadius(double radius)
    {
        this.radius = radius;
    }
    
    public double getRadius()
    {
        return radius;
    }
    
    public double getArea()
    {
        return PI*radius*radius;
    }
    
    public double getPerimeter()
    {
        return 2*radius*PI;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", PI=" + PI + '}';
    }
    
    
    
    
}
