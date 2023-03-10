/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author thanh ha
 */
public class Square extends Rectangle 
{   private double side;
    public Square()
    {
        
    }
    
    public Square(double side)
    {
        
    }
    
    public Square (double side, String color, boolean filled)
    {
        setSide(side);
        
    }
    
    private void setSide(double side)
    {
        this.side = side;
    }
    
    public double getSide()
    {
        return side;
    }

    @Override
    public String toString() {
        return "Square{" + "side=" + side + '}';
    }
    
    
}
