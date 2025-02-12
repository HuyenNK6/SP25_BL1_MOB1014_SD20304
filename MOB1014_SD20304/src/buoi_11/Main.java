/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_11;

import java.util.ArrayList;


/**
 *
 * @author Huyen
 */
public class Main {
    public static void main(String[] args) {
        //tạo 3 đối tượng bằng constructor có tham số
        BaiHat bh1= new BaiHat(1, "Thien ly oi", "J97", 180, 5 );
        BaiHat bh2= new BaiHat(2, "Song gio", "KICM", 180, 4.8);
        BaiHat bh3= new BaiHat(3, "Hong nhan", "Tuan", 200, 3.0 );
        
        //in thông tin
        bh1.inThongTin();
        bh2.inThongTin();
        bh3.inThongTin();
        
        //1. khởi tạo ArrayList => import java.util.ArrayList;
        ArrayList <BaiHat> lstBaiHats= new ArrayList<>();
        System.out.println("size = "+ lstBaiHats.size());
        //2. thêm đối tượng vào danh sách
        lstBaiHats.add(bh1);
        lstBaiHats.add(bh2);
        lstBaiHats.add(bh3);
        System.out.println("size = "+ lstBaiHats.size());
        //3. duyệt danh sách
        System.out.println("Cách 1: for i");
        //for tab
        for (int i = 0; i < lstBaiHats.size(); i++) {
            lstBaiHats.get(i).inThongTin();
            //lstBaiHats.get(i): 
            //lấy ra đối tượng Bài hát tại vị trí i 
            //trong list lstBaiHats
        }
        System.out.println("Cách 2: for each");
        //fore tab
        for (BaiHat baiHat : lstBaiHats) {
            baiHat.inThongTin();
        }
        
    }
}
