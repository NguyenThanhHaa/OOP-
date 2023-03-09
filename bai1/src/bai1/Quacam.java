/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author thanh ha
 */

import java.util.Scanner;
public class Quacam extends class Hoaqua
{
    private String masp;
    
    public Quacam(String masp,String xuatxu, int soluong, double giatien, String ngaynhap)
    {
        super(xuatxu,soluong, giatien, ngaynhap);
        
        setMasp(masp);
    }
    
    private void setMasp(String masp)
    {
        this.masp = masp;
    }
    
    public String getMasp()
    {
        return masp;
    }
    
    public void NhapCam()
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Nhap ma san pham: ");
        masp = input.nextLine();
    }
    
}    
