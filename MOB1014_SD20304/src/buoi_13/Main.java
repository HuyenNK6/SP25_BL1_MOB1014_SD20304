/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_13;

import java.util.Scanner;

/**
 *
 * @author Huyen
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLTraSua quanLy = new QLTraSua();
        int luaChon;
        do {
            System.out.println("----MENU----");
            System.out.println("1. Nhập danh sách");
            System.out.println("2. Xuất danh sách");
            System.out.println("3. Tìm kiếm theo id");
            System.out.println("0. Thoát");
            System.out.println("Mời chọn: ");
            luaChon = Integer.parseInt(sc.nextLine());
            //sw + tab
            switch (luaChon) {
                case 1:
                    quanLy.nhap();
                    break;
                case 2:
                    quanLy.xuat();
                    break;
                case 3:
                    //
                    break;
                case 0:
                    System.out.println("0. Thoát");
                    System.exit(0);
                default:
                    System.out.println("Mời nhập lại!!");
            }
        } while (luaChon != 0);
    }
}
