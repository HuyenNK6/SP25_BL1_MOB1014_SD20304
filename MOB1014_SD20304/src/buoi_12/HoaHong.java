/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_12;

/**
 *
 * @author Huyen
 */
public class HoaHong extends Hoa{
    private String loai;

    public HoaHong() {
    }

    public HoaHong(String loai) {
        this.loai = loai;
    }

    public HoaHong(String loai, int id, String ten, String mauSac, double gia, int soLuong) {
        super(id, ten, mauSac, gia, soLuong);
        this.loai = loai;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    @Override
    public void inThongTin() {
        super.inThongTin(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("loai: "+ loai);
    }
    
}
