/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author thanh ha
 */
public class Car extends Vehicle 
{   
    public Car(String model, String color)
    {
        super(model,color);
    }
    
    
    
    @Override
    public void Run() {
        System.out.println("Car is running, please wait....");
    }
}
