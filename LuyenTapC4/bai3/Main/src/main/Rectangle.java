/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author thanh ha
 */
public class Rectangle extends Shape 
{
    private double width = 1.0;
    private double length = 1.0;
    
    public Rectangle()
    {
        
    }
    
    public Rectangle(double width, double length)
    {
        
    }
    
    public Rectangle (double width, double length,String color, boolean filled)
    {
        super(color, filled);
        setWidth(width);
        setLength(length);
    }
    
    private void setWidth(double width)
    {
        if(width>0)
            this.width = width;
        else
            this.width= -1;
    }
    
    public String getWidth()
    {
        if (width!=-1)
            return String.valueOf(width);
        else
            return "Khong hop le";
    }
    
    private void setLength(double length)
    {
            this.length = length;
    }
    
    public double getLength()
    {
        return length;
    }
    
    public double getArea()
    {
        return width*length ;
    }
    
    public double getPerimeter()
    {
         return 2*(width+length);
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", length=" + length + '}';
    }
    
    
    
    
}
