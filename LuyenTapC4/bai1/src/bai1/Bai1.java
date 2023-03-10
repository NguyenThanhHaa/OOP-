/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai1;

/**
 *
 * @author thanh ha
 */
public class Bai1 {

   
    public static void main(String[] args) 
    {
        HoaQua cam1 = new HoaQua();
        cam1.Nhap();
        cam1.Xuat();
        
        Quacam cs = new CamSanh(90,2,"CS01","","25/12/2022",-50,550.420);
        
        System.out.println("Xuat xu cua cam sanh: " +cs.getXuatXu());
        System.out.println("So luong cua cam sanh: " +cs.getSoLuong());
        
    }
    
}
