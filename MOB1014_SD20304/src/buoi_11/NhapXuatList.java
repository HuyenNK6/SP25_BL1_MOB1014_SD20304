/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Huyen
 */
public class NhapXuatList {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<BaiHat> lstBaiHats= new ArrayList<>();
        System.out.println("Mời nhập số lượng: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("------NHẬP---------");
        for (int i = 0; i < n; i++) {
            //1. khởi tạo đối tượng = constructor ko tham số
            BaiHat bh= new BaiHat();
            //2. nhập thông tin
            System.out.println("---NHẬP THÔNG TIN ---");
            System.out.print("Mời nhập id: ");
            bh.setId(Integer.parseInt(sc.nextLine()));
            System.out.print("Mời nhập tên:");
            bh.setTen(sc.nextLine());
            System.out.print("Mời nhập ca sĩ:");
            bh.setCaSi(sc.nextLine());
            System.out.print("Mời nhập thời lượng:");
            bh.setThoiLuong(Integer.parseInt(sc.nextLine()));
            System.out.print("Mời nhập đánh giá:");
            bh.setDanhGia(Double.parseDouble(sc.nextLine()));
            //3. thêm đối tượng vào danh sách
            lstBaiHats.add(bh);///lưu ý
        }
        System.out.println("-----------IN THÔNG TIN---------");
        for (BaiHat bh : lstBaiHats) {
            bh.inThongTin();
        }
    }
}
