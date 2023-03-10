/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author thanh ha
 */

public class CamCaoPhong extends Quacam
{
    private int size;
    
    public CamCaoPhong()
    {
        
    }
    
    public CamCaoPhong(int size)
    {
        super();
        
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
    public void Xuat() {
        System.out.println("Xuat xu Cam Cao Phong: " +XuatXu);
        
        System.out.println("Ngay nhap hang Cam Cao Phong: "+NgayNhap);
        
        System.out.println("So luong Cam Cao Phong: "+SoLuong);
        
        System.out.println("Gia tien hang Cam Cao Phong: "+GiaTien);
         
        
    }
    
}

