/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Huyen
 */
public class QLTraSua {

    Scanner sc = new Scanner(System.in);
    ArrayList<TraSua> lstTraSuas = new ArrayList<>();

    //tạo constructor ko tham số=> ctrl cách enter
    //khởi tạo các dữ liệu mặc định => fake data
    public QLTraSua() {
        lstTraSuas.add(new TraSua(1, "TocoToco", 20000, 2, 5, true));
        lstTraSuas.add(new TraSua(2, "Highland", 45000, 1, 3, true));
        lstTraSuas.add(new TraSua(3, "Dingtea", 34000, 2, 5, false));
        lstTraSuas.add(new TraSua(4, "KOI", 80000, 2, 4, false));
        lstTraSuas.add(new TraSua(5, "Phela", 56000, 1, 2, true));
        lstTraSuas.add(new TraSua(6, "Phela", 56000, 1, 2, true));
    }

    public void nhap() {
        String tiepTuc;
        do {
            //1. khởi tạo đối tượng mới
            TraSua traSua = new TraSua();
            //2. nhập thông tin
            System.out.println("--------Nhập thông tin--------");
            System.out.println("Moi nhap id: ");
            traSua.setId(Integer.parseInt(sc.nextLine()));
            System.out.println("Moi nhap hang: ");
            traSua.setHang(sc.nextLine());
            System.out.println("Moi nhap gia: ");
            traSua.setGia(Double.parseDouble(sc.nextLine()));
            System.out.println("Moi nhap size: ");
            traSua.setSize(Integer.parseInt(sc.nextLine()));
            System.out.println("Moi nhap so luong: ");
            traSua.setSoLuong(Integer.parseInt(sc.nextLine()));
            System.out.println("Moi nhap han su dung");
            traSua.setHanSuDung(Boolean.parseBoolean(sc.nextLine()));
            //3. thêm đối tượng vào danh sách
            lstTraSuas.add(traSua);
            //4. hỏi tiếp tục
            System.out.println("Bạn co muon tiep tuc hay khong(co/khong)");
            tiepTuc = sc.nextLine();
        } while (tiepTuc.equalsIgnoreCase("co"));
    }

    public void xuat() {
        for (TraSua ts : lstTraSuas) {
            ts.inThongTin();
        }
    }
//    /3.  Tìm kiếm đối tượng theo id => vị trí

    public void timKiemTheoId() {
        System.out.println("Mời nhập id cần tìm: ");
        int id = Integer.parseInt(sc.nextLine());
        //cách 1: for tab
        for (int i = 0; i < lstTraSuas.size(); i++) {
            if (id == lstTraSuas.get(i).getId()) {
                //lstTraSuas.get(i): đối tượng tại vị trí i
                System.out.println("Đã tìm thấy tại vị trí " + i);
                lstTraSuas.get(i).inThongTin();
                return;
            }
        }
        System.out.println("Không tìm thấy!");
        //cách 2: fore tab
//        for (TraSua ts : lstTraSuas) {
//            if(id == ts.getId()){
//                System.out.println("Đã tìm thấy: ");
//                ts.inThongTin();
//            }
//        }
    }

    //4. Tìm kiếm đối tượng theo hãng
    public void timKiemTheoHang() {
        System.out.println("Mời nhập hãng cần tìm: ");
        String hang = sc.nextLine();
        int count = 0;
        for (int i = 0; i < lstTraSuas.size(); i++) {
            if (lstTraSuas.get(i).getHang().equalsIgnoreCase(hang)) {
                lstTraSuas.get(i).inThongTin();
                count++;//nếu tìm thấy thì tăng count lên 1 đơn vị
            }
        }
        if (count == 0) {
            System.out.println("Không tìm thấy!");
        }
    }
    public void timKiemTheoHang2() {
        System.out.println("Mời nhập hãng cần tìm: ");
        String hang = sc.nextLine();
        ArrayList<TraSua> list= new ArrayList<>(); //tạo list mới
        for (int i = 0; i < lstTraSuas.size(); i++) {
            if (lstTraSuas.get(i).getHang().equalsIgnoreCase(hang)) {
                list.add(lstTraSuas.get(i));
                //tìm thấy thì thêm đối tượng vào list mới
            }
        }
        if (list.isEmpty()) {//list.size() == 0 <=> list có trống?
            System.out.println("Không tìm thấy!");
        }else{
            for (TraSua traSua : list) {
                traSua.inThongTin();
            }
        }
    }
    //5. Sửa thông tin giá của đối tượng theo id
    public void suaThongTin(){
        System.out.println("Mời nhập id cần tìm để sửa: ");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < lstTraSuas.size(); i++) {
            if (id == lstTraSuas.get(i).getId()) {
                System.out.println("Đã tìm thấy tại vị trí " + i);
                lstTraSuas.get(i).inThongTin();
                System.out.println("Mời nhập giá cần sửa: ");
                double giaNew= Double.parseDouble(sc.nextLine());
                lstTraSuas.get(i).setGia(giaNew);//cập nhật giá mới
                lstTraSuas.get(i).inThongTin();
                return;
            }
        }
        System.out.println("Không tìm thấy!!!");
    }
    //8. Xóa đối tượng theo id
    public void xoa() {
        System.out.println("Mời nhập id cần xóa: ");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < lstTraSuas.size(); i++) {
            if (id == lstTraSuas.get(i).getId()) {
                lstTraSuas.remove(i);//xóa đối tượng tại vị trí i
                xuat();//gọi lại xuat() để in toàn bộ danh sách
                return;
            }
        }
        System.out.println("Không tìm thấy!!");
    }
    //9. Sắp xếp danh sách tăng dần theo số lượng
    public void sapXep(){
        //import java.util.Collections;
        Collections.sort(lstTraSuas, new Comparator<TraSua>() {
            @Override
            public int compare(TraSua o1, TraSua o2) {
                //Sắp xếp danh sách tăng dần theo số lượng
                //return Integer.compare(o1.getSoLuong(), o2.getSoLuong());
                //Sắp xếp danh sách giảm dần theo số lượng
                //return Integer.compare(o2.getSoLuong(), o1.getSoLuong());
                //Sắp xếp danh sách tăng dần theo hãng => a-z
                return o1.getHang().compareTo(o2.getHang());
            }
        });
        Collections.sort(lstTraSuas, (TraSua o1, TraSua o2) -> Integer.compare(o1.getSoLuong(), o2.getSoLuong()));
        //đảo ngược lại danh sách
       // Collections.reverse(lstTraSuas);
        xuat();
    }
}
