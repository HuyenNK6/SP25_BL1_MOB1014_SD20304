/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_2;

import java.util.Scanner;


/**
 *
 * @author Huyen
 */
public class NhapXuatDuLieu {

    /*
         * P1: Ép kiểu - Chuyển đổi từ kiểu dữ liệu số sang dạng số khác - Không đổ kiểu dữ liệu lớn về bé mà chỉ bé lên lớn ví dụ int lớn hơn byte hoặc long nhất trong số nguyên. Ngoài ra các bạn có thể tham khảo lại trong bảng kích thước kiểu dữ liệu.
         *
         * Công thức ép kiểu tường minh:
         *        (<kiểu dữ liệu>) <biến cần ép kiểu>;
         *
         * P2: Ép kiểu từ string về số
         *  
     */
 /* Lớp bao- Wrapper
        Đối vs mỗi kiểu dữ liệu nguyên thủy,
        => 1 lớp bao tương ứng
        int => Integer
        double => Double
        float => Float
        char => Character
        boolean => Boolean.....
     */
    //main tab
    public static void main(String[] args) {
        //Lớp Scanner -> hỗ trợ trong việc nhập giá trị từ bàn phím
        //khởi tạo 1 đối tượng scanner
        //sử dụng tổ hợp phím Ctrl + Space
        Scanner sc = new Scanner(System.in);
        //sout tab
        System.out.println("Mời nhập mã SV: ");
        String msv = sc.nextLine();//đọc cả 1 dòng dữ liệu
        //họ tên, năm sinh, giới tính (boolean), tên chuyên ngành
        System.out.println("Mời nhập họ tên");
        String hoTen = sc.nextLine();
        System.out.println("Mời nhập năm sinh");
        // int namSinh = sc.nextLine(); //sc.nextLine() -> trả về kiểu String
//        int namSinh = sc.nextInt(); //dễ gặp tình trạng bị trôi lệnh
//        sc.nextLine(); //đọc nốt dữ liệu thừa
//ÉP KIỂU: khác String
//Ép kiểu từ String về int
//kiểu dữ liệu nguyên thủy -> tương ứng có 1 lớp bao
//int -> Integer
        int namSinh = Integer.parseInt(sc.nextLine());
        System.out.println("Mời nhập giới tính: ");
        boolean gioiTinh = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Mời nhập tên chuyên ngành: ");
        String tenCN = sc.nextLine();

        System.out.println("---IN THÔNG TIN-----");
        System.out.println("MSV: " + msv);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Năm sinh: "+ namSinh);
        System.out.println("Giới tính: "+ gioiTinh);
        System.out.println("Tên CN: "+ tenCN);
    }
}
