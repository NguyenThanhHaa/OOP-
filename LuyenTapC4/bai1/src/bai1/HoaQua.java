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
public class HoaQua
{
    public String XuatXu;
    public String NgayNhap;
    public int SoLuong;
    public double GiaTien;
    
    public HoaQua()
    {
        
    }
    
    public HoaQua(String Xuatxu, String NgayNhap, int SoLuong, double GiaTien)
    {
        setXuatXu(XuatXu);
        setNgayNhap(NgayNhap);
        setSoLuong(SoLuong);
        setGiaTien(GiaTien);
    }
    
    private void setXuatXu(String XuatXu)
    {
        if (XuatXu==null || XuatXu.isEmpty() )
            this.XuatXu = "Khong hop le";
        
        else
            this.XuatXu = XuatXu;
            
    }
    
    public String getXuatXu()
    {
        return XuatXu;
    }
    
    private void setNgayNhap(String NgayNhap)
    {
        this.NgayNhap = NgayNhap;
    }
    
    public String getNgayNhap()
    {
        return this.NgayNhap;
    }
    
    private void setSoLuong(int SoLuong)
    {
        if (SoLuong > 0)
            this.SoLuong = SoLuong;
        
        else
            this.SoLuong = -1;
    }
    
    public String getSoLuong()
    {
        if (this.SoLuong!=-1)
            return String.valueOf(SoLuong);
        else
            return "Khong hop le";
    }
    
    private void setGiaTien(double GiaTien)
    {
        if (GiaTien >0)
            this.GiaTien=GiaTien;
        else
            this.GiaTien=-1;
    }
    
    public String getGiaTien()
    {
        if (this.GiaTien!=-1)
            return String.valueOf(GiaTien);
        else
            return "Khong hop le";
    }
    
    public void Nhap()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nhap xuat xu: ");
        XuatXu = input.nextLine();
        
        System.out.println("Nhap ngay nhap hang: ");
        NgayNhap = input.nextLine();
        
        System.out.println("Nhap so luong hang: ");
        SoLuong = input.nextInt();
        
        System.out.println("Nhap gia tien hang: ");
        GiaTien = input.nextDouble();
    }
    
    public void Xuat()
    {
        System.out.println("Nhap xuat xu: " +getXuatXu());
        
        System.out.println("Nhap ngay nhap hang: "+getNgayNhap());
        
        System.out.println("Nhap so luong hang: "+getSoLuong());
        
        System.out.println("Nhap gia tien hang: "+getGiaTien());
         
    }
    
    
}