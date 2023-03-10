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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle c1 = new Circle();
        
        System.out.println("Dien tich hinh tron la: " +c1.getArea());
        System.out.println("Chu vi hinh tron la: "+c1.getPerimeter());
        
        
        Rectangle r1 = new Rectangle();
        System.out.println("Dien tich hinh chu nhat la: " +r1.getArea());
        System.out.println("Chu vi hinh chu nhat la: "+r1.getPerimeter());
        
        Square sq1 = new Square(4.5,"do",true);
        System.out.println("Canh hinh vuong la: " +sq1.getSide());
        System.out.println("Canh hinh vuong la: " +sq1.getColor());
        System.out.println("Canh hinh vuong la: " +sq1.isFilled());
    }
    
}
