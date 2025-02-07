/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_8;

/**
 *
 * @author Huyen
 */
public class Main {
    public static void main(String[] args) {
        //khởi tạo đối tượng SV
        //=> sử dụng Ctrl cách để gợi ý
        //Constructor không tham số
        SinhVien sv1= new SinhVien();
        sv1.setMsv("PH01");
        sv1.setHoTen("Anh Dung");
        sv1.setGioiTinh(true);
        sv1.setNgaySinh("10/04/2000");
        sv1.setNganhHoc("UDPM");
        sv1.setKyHoc(7);
        sv1.setDiem(2);        
        //Constructor có tham số
        SinhVien sv2= new SinhVien("PH02", "Khanh Huyen", false, "07/02/2005",
                "PTPM", 2, 10);
        
        //in thông tin
        sv1.inThongTin();
        sv2.inThongTin();
        System.out.println("Diem sv1 = "+ sv1.getDiem());
    }
}
