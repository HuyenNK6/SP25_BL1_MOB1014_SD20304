/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_4;

import java.util.Scanner;

/**
 *
 * @author Huyen
 */
/*
    Tạo menu sử switch case => menu có lặp
    Nhập vào 1 số nguyên dương, kiểm tra số đó có chia hết cho 3 & 5 hay không
    Nhập thông tin của sản phẩm: Mã sản phẩm, tên sản phẩm, giá nhập. Tính giá bán, giá bán cao hơn 15% giá nhập -> in toàn bộ thông tin
 */
public class BTVN_Buoi4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luaChon;
        do {
            System.out.println("~~~Menu~~~");
            System.out.println("1.Kiem tra so duong");
            System.out.println("2.Thong tin san pham");
            System.out.println("~~~~~~~~~~");
            System.out.println("Moi chon");
            luaChon = Integer.parseInt(sc.nextLine());
            switch (luaChon) {
                case 1:
                    kiemTraSoNguyen();
                    break;
                case 2:
                    thongTinSP();
                    break;
                case 3:
                    System.out.println("Ban da thoat chuong trinh");
                    System.exit(0);
                default:
                    System.out.println("Lua chon khong hop le");
            }
        } while (luaChon != 3);
        System.out.println("ket thuc");
    }
    
    public static void kiemTraSoNguyen() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap so nguyen duong:");
        int snd = Integer.parseInt(sc.nextLine());
        if (snd > 0) {
            if (snd % 3 == 0 && snd % 5 == 0) {
                System.out.println("so " + snd + " chia het cho 3 va 5");
            } else {
                System.out.println("so " + snd + " khong chia het cho 3 va 5");
            }

        } else {
            System.out.println("Moi nhap lai so nguyen duong");
        }
    }

    public static void thongTinSP() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap ma san pham:");
        String msp = sc.nextLine();
        System.out.println("Moi nhap ten san pham:");
        String tsp = sc.nextLine();
        System.out.println("Moi nhap gia san pham:");
        double gsp = Double.parseDouble(sc.nextLine());
        double giaBan;
        giaBan = 1.15 * gsp;
        System.out.println("Ma san pham:" + msp);
        System.out.println("Ten san pham:" + tsp);
        System.out.println("Gia san pham:" + gsp);
        System.out.println("Gia ban san pham:" + giaBan);
    }

}
