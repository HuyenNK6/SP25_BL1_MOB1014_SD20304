/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_11;

/**
 *
 * @author Huyen
 */
public class BaiHat {

    //1. private thuộc tính: 
    //id, tên, ca sĩ, thời lượng, đánh giá
    private int id;
    private String ten;
    private String caSi;
    private int thoiLuong;
    private double danhGia;
    //2. Constructor

    public BaiHat() {
    }

    public BaiHat(int id, String ten, String caSi, int thoiLuong, double danhGia) {
        this.id = id;
        this.ten = ten;
        this.caSi = caSi;
        this.thoiLuong = thoiLuong;
        this.danhGia = danhGia;
    }

    //3. Getter setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getCaSi() {
        return caSi;
    }

    public void setCaSi(String caSi) {
        this.caSi = caSi;
    }

    public int getThoiLuong() {
        return thoiLuong;
    }

    public void setThoiLuong(int thoiLuong) {
        this.thoiLuong = thoiLuong;
    }

    public double getDanhGia() {
        return danhGia;
    }

    public void setDanhGia(double danhGia) {
        this.danhGia = danhGia;
    }
    //4. inThongTin()

    @Override
    public String toString() {
        return "BaiHat{" + "id=" + id + ", ten=" + ten + ", caSi=" + caSi + ", thoiLuong=" + thoiLuong + ", danhGia=" + danhGia + '}';
    }
    public void inThongTin(){
        System.out.println(toString());
    }
    
}
