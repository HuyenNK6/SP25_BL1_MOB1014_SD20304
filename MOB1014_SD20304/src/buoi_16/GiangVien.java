/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_16;

/**
 *
 * @author Huyen
 */
public class GiangVien {
    //maGV, ten, boMon, luong;
    private String maGV;
    private String ten;
    private String boMon;
    private int luong;

    public GiangVien() {
    }

    public GiangVien(String maGV, String ten, String boMon, int luong) {
        this.maGV = maGV;
        this.ten = ten;
        this.boMon = boMon;
        this.luong = luong;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getBoMon() {
        return boMon;
    }

    public void setBoMon(String boMon) {
        this.boMon = boMon;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "GiangVien{" + "maGV=" + maGV + ", ten=" + ten + ", boMon=" + boMon + ", luong=" + luong + '}';
    }
    
    public void inThongTin(){
        System.out.println(toString());
    }
    
}
