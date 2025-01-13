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
         * 4 Loại toán tử trong lập trình
         *  1. Toán tử số học:
         *  (+ - * / % ++ --)
         *      +: Tính tổng của 2 số hoặc dùng để cộng chuỗi
         *      -: Phép trừ của 2 số
         *      *: Phép nhân của 2 số
         *      /: Phép chia lấy nguyên của 2 số
         *      %: Phép chia lấy dư của 2 số
         *      ++: Tăng lên 1 đơn vị
         *      --: Giảm 1 đơn vị
         *  2. Toán tử so sánh:
         *  (> < >= <= == !=)
         *      >: Lớn hơn
         *      <: nhỏ hơn
         *      >=: lớn hơn hoặc bằng
         *      <=: nhỏ hơn hoặc bằng
         *      ==: so sánh bằng
         *      !=: so sánh khác
         *  3. Toán tử Logic:
         * (&& || !)
         *      &&: Yêu cầu các mệnh đề phải luôn đúng
         *      ||: Yêu cầu 1 trong các mệnh đề dúng là được
         *      !: Lấy giá trị phủ định của mệnh đề.
         *  4. Toán tử gán:
         * (= += -= *= /= %=)
         *      +=: Cộng tiếp với vế bên phải các phép còn lại tương tự
 */

 /*
         * Toán tử ba ngôi
         *  (<biểu thức> ? <kết quả đúng> : <kết quả sai>)
 */

 /*
	* 1. CẤU TRÚC IF
	*	if (điều kiện){
	*		//thực hiện công việc
	*	}
	* 2. CẤU TRÚC IF-ELSE
	*	if (điều kiện){
	*		//thực hiện công việc 1
	*	}else{
	*		//thực hiện công việc 2
	*	}
	* 3. CẤU TRÚC IF-ELSE IF
	*	if (điều kiện 1){
	*		//thực hiện công việc 1
	*	}else if(điều kiện 2){
	*		//thực hiện công việc 2
	*	}else if(điều kiện 3){
	*		//thực hiện công việc 3
	*	}else{
	* 		//thực hiện công việc n
	*	}
 */

 /*
       * Bài Vòng lặp:
       *
       * Định nghĩa chung cho tất cả vòng lặp:
       * Vòng lặp cho phép lặp lại một hoặc nhiều câu lệnh cho đến khi thỏa mãn điều kiện được chỉ định định.
       *
       * Các loại vòng lặp: while, do..while, for, foreach
       *
       * Từ khóa sử dụng trong vòng lặp:
       *
       * break - ngắt vòng lặp
       * continue: Sẽ bỏ qua các đoạn code phía sau nó và nó quay trở lại lần lặp tiếp theo.
       *
       * Vòng lặp while: Chỉ chạy khi điều kiện luôn đúng và nếu điều kiện luôn đúng ko điểm dừng thì được gọi là vòng lặp vô hạn.
       * + Cách dùng: wh + tab
       *
       * + Công thức:
       *  while (true)
          {
              //Thực thi 1 câu lệnh hoặc nhiều câu lệnh
          }
          Vòng lặp Do..While: Thực hiện hành động ít nhất là 1 lần. Điều kiện đề vòng lặp chạy giống như While(True).
         Cách gõ: do + tab

       Công thức:
         do {
                    //Thực hiện hành động ít nhất là 1 lần.
         } while (true);
 */
public class CauTrucReNhanh {

    //main + tab
    /*
    1. Nhập vào 1 số nguyên kiểm tra đó là số chẵn hay số lẻ 
    2. Nhập vào 3 số nguyên. Tìm max, min trong 3 số vừa nhập 
    3. Nhập điểm toán kiểu int, lý kiểu int, hoá kiểu int. Tính điểm trung bình bằng trung bình cộng của 3 điểm toán , lý , hoá vừa nhập và in ra màn hình loại sinh viên tương ứng nếu: 	
    0 <= điểm trung bình <5 : SV yếu 	
    5<=điểm trung bình <7 : SV TB 	
    7<= điểm trung bình <8 : SV khá 
    8<= điểm trung bình < 9: SV giỏi 
    9<= điểm trung bình <= 10 : SV xuất sắc 

     */
    public static void main(String[] args) {
        //tổ hợp phím Ctrl + cách
        Scanner sc = new Scanner(System.in);
        //sout + tab
        //Ctrl + Shift + mũi tên xuống
        System.out.println("Mời nhập số a= ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Mời nhập số b= ");
        int b = Integer.parseInt(sc.nextLine());
        System.out.println("Mời nhập số c= ");
        int c = Integer.parseInt(sc.nextLine());

        //if + tổ hợp phím Ctrl + cách 
        //format code -> click chuột phải -> chọn format
        //hoặc tổ hợp phím Alt+ Shift+ F
        if (a % 2 == 0) {
            System.out.println(a + " la so chan");
        } else {
            System.out.println(a + " la so le");
        }
        //tìm số lớn nhất trong 3 số
        if (a > b && a > c) {
            System.out.println("So lon nhat la: " + a);
        } else if (b > a && b > c) {
            System.out.println("So lon nhat la: " + b);
        } else {
            System.out.println("So lon nhat la: " + c);
        }

    }
}
