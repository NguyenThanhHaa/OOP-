/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4;

/**
 *
 * @author thanh ha
 */

import java.lang.Math;
public class LAB4 {

   public class Circle
    {
        private double radius;
        private String color;
        
    }
   
   public Circle(double radius, String color)
   {
       setRadius(radius);
       setColor(color);
   }
   
   private void setRadius(double radius)
   {
       this.radius = radius;
   }
   
   public double getRadius()
   {
       return radius;
   }
   
   priavte void setColor(String color)
   {
       this.color = color;
   }
   
   public String getColor()
   {
       return color;
   }
   
   public double getArea()
   {
       return this.radius * this.radius * math.PI;
   }
   
   public String toString()
   {
       return "Circle: " + "radius= " + radius + " ,color= '" + color + '\'' + '}';
   }
   
   public class Cylinder extends Circle
   {
       private double height;
       
       public Cylinder(double height, String color, double radius)
       {    super(radius, color);
           setHeight(height);
       }
       
       private void setHeight(double height)
       {
           this.height = height;
       }
       
       public double getHeight()
       {
           return height;
       }
       
       public double getVolume()
       {
           return super.getArea() * this.height;
       }
   }
   
   
}
