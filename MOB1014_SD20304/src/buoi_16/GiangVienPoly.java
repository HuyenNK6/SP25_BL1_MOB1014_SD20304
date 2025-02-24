/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_16;

/**
 *
 * @author Huyen
 */
//LỚP CHA: Giảng viên
//LỚP CON: Giảng viên Poly
//sử dụng từ khóa extends => để thể hiện mqh kế thừa
//ex ctrl cách
public class GiangVienPoly extends GiangVien{
    //Lớp CON được kế thừa toàn bộ 
    //thuộc tính & phương thức của lớp CHA
    //ngoài ra, CON có thể có thuộc tính & PT riêng
    private String accountFPL;
    //tạo constructor
    //=> ctrl cách enter x3 lần
    //Insert code => select none & select all (tích chọn hết 2 bên)
    //nếu ko đủ 3 cái => xem lại constructor cha
    public GiangVienPoly() {
    }

    public GiangVienPoly(String accountFPL) {
        this.accountFPL = accountFPL;
    }
//super: từ khóa tham chiếu tới đối tượng của lớp cha
    public GiangVienPoly(String accountFPL, String maGV, String ten, String boMon, int luong) {
        super(maGV, ten, boMon, luong);
        this.accountFPL = accountFPL;
    }

    public String getAccountFPL() {
        return accountFPL;
    }

    public void setAccountFPL(String accountFPL) {
        this.accountFPL = accountFPL;
    }
   
    //KẾ THỪA PHƯƠNG THỨC IN THÔNG TIN
    //Ghi đè phương thức: Override
    //Insert COde => Override method => tích chọn inThongTin()

    @Override
    public void inThongTin() {
        super.inThongTin(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        //System.out.println("accountFPL: "+ accountFPL);
    }

    @Override
    public String toString() {
        return super.toString()+ "GiangVienPoly{" + "accountFPL=" + accountFPL + '}';
    }
    
    
}
