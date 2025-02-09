/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_9;

import java.util.Scanner;

/**
 *
 * @author Huyen
 */
public class Main {
    //main tab
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //1. khởi tạo đối tượng = constructor có tham số
        MayTinh mt1= new MayTinh("MT01", "Macbook", 2020, 50000, 3);
        
        //2. khởi tạo đối tượng = constructor có tham số => nhập từ bàn phím
        System.out.println("--------NHẬP THÔNG TIN---------");
        System.out.print("Mời nhập mã: ");
        String ma= sc.nextLine();
        System.out.print("Mời nhập hãng: ");
        String hang= sc.nextLine();
        System.out.print("Mời nhập năm sản xuất: ");
        int namSX= Integer.parseInt(sc.nextLine());
        System.out.print("Mời nhập giá: ");
        int gia= Integer.parseInt(sc.nextLine());
        System.out.print("Mời nhập trạng thái (1-2): ");
        int trangThai= Integer.parseInt(sc.nextLine());
        
        MayTinh mt2= new MayTinh(ma, hang, namSX, gia, trangThai);
        
        //3. khởi tạo đối tượng = constructor không tham số => nhập từ bàn phím
        MayTinh mt3= new MayTinh();
        System.out.println("--------NHẬP THÔNG TIN---------");
        System.out.print("Mời nhập mã: ");
//        String ma3= sc.nextLine();
//        mt3.setMa(ma3);
        mt3.setMa(sc.nextLine());
        System.out.print("Mời nhập hãng: ");
        mt3.setHang(sc.nextLine());
        System.out.print("Mời nhập năm sản xuất: ");
        mt3.setNamSX(Integer.parseInt(sc.nextLine()));
        System.out.print("Mời nhập giá: ");
        mt3.setGia(Integer.parseInt(sc.nextLine()));
        System.out.print("Mời nhập trạng thái (1-2): ");
        mt3.setTrangThai(Integer.parseInt(sc.nextLine()));
        
        //in thông tin
        System.out.println("--------IN THÔNG TIN-----------");
        mt1.inThongTin();
        mt2.inThongTin();
        mt3.inThongTin();
    }
}
