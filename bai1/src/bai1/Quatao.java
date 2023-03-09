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
    
public class Quatao extends class Hoaqua
{
    private String masp;
    private String mau;
    
    public Quatao(String masp, String mau,String xuatxu, int soluong, double giatien, String ngaynhap )
    {
        super(xuatxu,soluong,giatien,ngaynhap);
        setMasp(masp);
        setMau(mau);
    }
    
    private void setMasp(String masp)
    {
        this.masp = masp;
    }
    
    public String getMasp()
    {
        return masp; 
    }
    
    private void setMau(String mau)
    {
        this.mau=mau;
    }
    
    public String getMau()
    {
        return mau;
    }
    
    public void NhapTao()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ma san pham: ");
        masp= input.nextLine();
        
        System.out.println("Nhap mau: ");
        mau= input.nextLine();
        
    }
}

