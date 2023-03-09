/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author thanh ha
 */
public class HoaQua {
    public class Hoaqua 
{
    private String xuatxu;
    private int soluong;
    private double giatien;
    private String ngaynhap;


public Hoaqua (String xuatxu, int soluong, double giatien, String ngaynhap)
{   
    setXuatxu(xuatxu);
    setSoluong(soluong);
    setGiatien(giatien);
    setNgaynhap(ngaynhap);
    
}

private void setXuatxu(String xuatxu)
{
    if (xuatxu==null || xuatxu.isEmpty())
    {
        this.xuatxu = "Khong biet";
    }
    
    else
        this.xuatxu = xuatxu;
}

public String getXuatxu()
{
    return xuatxu;
}

private void setSoluong (int soluong)
{
    if (soluong > 0)
    {
        this.soluong = soluong;
    }
    
    else
    {
        this.soluong =-1;
    }
}

public String getSoluong()
{
    if (this.soluong != -1)
    {
        return String.valueOf(soluong);
    }
    
    else
    {
        return "So luong khong hop le";
    }
}

private void setGiatien(double giatien)
{
    if (giatien > 0)
    {
        this.giatien = giatien;
    }
    
    else 
    {
        this.giatien = -1;
    }
}

public String getGiatien()
{
    if (this.giatien !=-1)
    {
        return String.valueOf(giatien);
    }
    
    else
       return "Gia tien khong hop le";
}

private void setNgaynhap(String ngaynhap)
{
    this.ngaynhap=ngaynhap;
}

public String getNgaynhap()
{
    return ngaynhap;
}

public void NhapHoaQua()
{
    Scanner input = new Scanner(System.in);
    System.out.println("Nhap xuat xu: ");
    xuatxu = input.nextLine();
    
    System.out.println("Nhap so luong: ");
    soluong = input.nextInt();
    
    System.out.println("Nhap gia tien: ");
    giatien = input.nextDouble();
    
    System.out.println("Nhap ngay nhap: ");
    ngaynhap = input.nextLine(); 
}

}
