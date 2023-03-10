/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import javax.sound.midi.SysexMessage;

/**
 *
 * @author thanh ha
 */
public class Shape 
{
    private String color ="red";
    private boolean filled = true;
    
    public Shape()
    {
        
    }
    
    public Shape(String color, boolean filled)
    {
        setColor(color);
        setFilled(filled);
    }
    
    private void setColor(String color)
    {
        this.color = color;
    }
    
    public String getColor()
    {
        return color;
    }
    
    private void setFilled(boolean filled)
    {
        this.filled=filled;
    }
    
    public boolean isFilled()
    {
        return filled;
    }
    
    @Override
    public String toString()
    {
        return "Shape{" + "color=" + color + ", filled=" + filled + '}';
    }
    
}
