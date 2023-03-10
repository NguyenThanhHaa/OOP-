/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author thanh ha
 */
public class Main {
    
    public static void main(String[] args) 
    {
        
        Bicycle v1 = new Bicycle("V1035","den");
        System.out.println("Model: "+v1.getModel());
        System.out.println("Color: "+v1.getColor());
        v1.Run();
        
        Car c1 = new Car("C125","do");
        System.out.println("Model: "+c1.getModel());
        System.out.println("Color: "+c1.getColor());
        c1.Run();
        
     
    }
    
}
