/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_1;

/**
 *
 * @author Huyen
 */
public class BTVN_Buoi1 {
    public static void main(String[] args) {
        String hovaten="Kien";
        String masinhvien="PH61643";
        String ngaySinh= "1/8/2025";
        String diaChi ="HaNoi";
        boolean gioiTinh = true; //hoặc false
        //true - Nam false- Nữ
        System.out.println("Ten La: "+hovaten);
        System.out.println("Ma Sv la:"+masinhvien);
        System.out.println("Ngay sinh la:"+ngaySinh);
        System.out.println("Dia chi la: "+diaChi);
        System.out.println("Gioi tinh la: "+ (gioiTinh == true ? "nam" : "nữ") );
        //Toán tử 3 ngôi
        // biểu thức ? <giá trị đúng> : <giá trị sai>
        if(gioiTinh == true){
            System.out.println("Gioi tinh: Nam");
        }else{
            System.out.println("Gioi tinh: Nu");
        }
    }
   
}
