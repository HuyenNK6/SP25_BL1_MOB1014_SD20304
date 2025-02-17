/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_13;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Huyen
 */
public class QLTraSua {
    Scanner sc= new Scanner(System.in);
    ArrayList<TraSua> lstTraSuas= new ArrayList<>();
    public void nhap(){
        String tiepTuc;
        do{
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
        }while(tiepTuc.equalsIgnoreCase("co"));
    }
    public void xuat(){
        for (TraSua ts : lstTraSuas) {
            ts.inThongTin();
        }
    }
}
