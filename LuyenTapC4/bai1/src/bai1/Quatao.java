/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author thanh ha
 */
public class Quatao extends HoaQua
{
    private double weight;
    private String MaSP;
    
    public Quatao()
    {
        
    }
    
    public Quatao(double weight, String MaSP,String Xuatxu, String NgayNhap, int SoLuong, double GiaTien)
    {
        super (Xuatxu,NgayNhap,SoLuong,GiaTien);
        
        setWeight(weight);
        setMaSP(MaSP);    
    }
    
    private void setWeight(double weight)
    {
        if (weight >0)
            this.weight = weight;
        else
            this.weight = -1;
    }
    
    public String getWeight()
    {
        if (this.weight!=-1)
            return String.valueOf(weight);
        else
            return "Khong hop le";
    }
    
    private void setMaSP(String MaSP)
    {
        if (MaSP==null || MaSP.isEmpty())
            this.MaSP = "Khong hop le";
        else
            this.MaSP = MaSP;
    }
    
    public String getMaSP()
    {
        return this.MaSP;
    }
}