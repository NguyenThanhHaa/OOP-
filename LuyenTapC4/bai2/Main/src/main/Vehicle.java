/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author thanh ha
 */

import java.util.Scanner;
public class Vehicle 
{
    private String model;
    private String color;
    
    public Vehicle(String model, String color)
    {
        setModel(model);
        setColor(color);
    }
    public void Run()
    {
        System.out.println("Vehicle is running, please wait....");
    }
    
    private void setModel(String model)
    {
        this.model = model;
    }
    
    public String getModel()
    {
        return model;
    }
    
    private void setColor(String color)
    {
        this.color = color;
    }
    
    public String getColor()
    {
        return color;
    }
    
    
}
