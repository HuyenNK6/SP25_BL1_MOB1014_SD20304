/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_12;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Huyen
 */
public class HoaService {//QLHoa
    //class: xử lý toàn bộ logic
//khai báo toàn cục
    Scanner sc = new Scanner(System.in);
    ArrayList<Hoa> lstHoas = new ArrayList<>();

    public void nhap(){
        String tiepTuc;
        do {
            //1. khởi tạo đối tượng mới
            Hoa hoa = new Hoa();
            //2. nhập thông tin:id, tên, màu sắc, giá, số lượng
            System.out.println("------NHẬP THÔNG TIN--------");
            System.out.print("Mời nhập id: ");
            hoa.setId(Integer.parseInt(sc.nextLine()));
            System.out.print("Mời nhập tên: ");
            hoa.setTen(sc.nextLine());
            System.out.print("Mời nhập màu sắc: ");
            hoa.setMauSac(sc.nextLine());
            System.out.print("Mời nhập giá: ");
            hoa.setGia(Double.parseDouble(sc.nextLine()));
            System.out.print("Mời nhập số lượng: ");
            hoa.setSoLuong(Integer.parseInt(sc.nextLine()));
            //3. thêm đối tượng vào danh sách
            lstHoas.add(hoa);
            //4. hỏi tiếp tục
            System.out.println("Bạn có muốn tiếp tục ko (co/khong)? ");
            tiepTuc= sc.nextLine();
        } while (tiepTuc.equalsIgnoreCase("co"));
        //equals: so sánh chuỗi có phân biệt hoa thường
        //equalsIgnoreCase: so sánh chuỗi ko phân biệt hoa thường

    }
    public void xuat(){
         System.out.println("-----IN THÔNG TIN-----");
        //fore tab
        for (Hoa h : lstHoas) {
            h.inThongTin();
        }
    }
    public void keThua(){
        //code
    }
}