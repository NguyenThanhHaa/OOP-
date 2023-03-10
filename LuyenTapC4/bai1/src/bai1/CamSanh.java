/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author thanh ha
 */

public class CamSanh extends Quacam
{
    private int size;
    
    public CamSanh()
    {
        
    }
    
    public CamSanh(int size, double weight, String MaSP,String Xuatxu, String NgayNhap, int SoLuong, double GiaTien)
    {
        super(weight, MaSP,Xuatxu, NgayNhap, SoLuong,GiaTien);
        
        setSize(size);
        
    }
    
    private void setSize(int size)
    {
        this.size=size;
    }
    
    public int getSize()
    {
        return size;
    }

    @Override
    public void Nhap() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nhap xuat xu: ");
        XuatXu = input.nextLine();
        
        System.out.println("Nhap ngay nhap hang: ");
        NgayNhap = input.nextLine();
        
        System.out.println("Nhap so luong hang: ");
        SoLuong = input.nextInt();
        
        System.out.println("Nhap gia tien hang: ");
        GiaTien = input.nextDouble();
        
        System.out.println("Nhap kich thuoc: ");
        size = input.nextInt();
    }
    

    @Override
    public void Xuat() {
        System.out.println("Xuat xu Cam Sanh: " +XuatXu);
        
        System.out.println("Ngay nhap hang Cam Sanh: "+NgayNhap);
        
        System.out.println("So luong Cam Sanh: "+SoLuong);
        
        System.out.println("Gia tien hang Cam Sanh: "+GiaTien);
        
        System.out.println("Size Cam Sanh: "+size);
         
        
    }
    
}