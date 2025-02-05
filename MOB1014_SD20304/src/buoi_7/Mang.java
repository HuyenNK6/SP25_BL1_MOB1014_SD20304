/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_7;

import java.util.Arrays;

/**
 *
 * @author Huyen
 */
public class Mang {
    /*
         * Phần 1: Mảng 1 chiều
         *
         *  1. Định nghĩa: Mảng dùng để lưu trữ nhiều phần tử có cùng kiểu dữ liệu (Biến dùng để lưu trữ 1 giá trị có cùng kiểu dữ liệu).
         *          - Để truy xuất (để lấy giá trị) các phần tử thì cần phải biết chỉ số(index). Index là số nguyên và bắt đầu từ 0 1 2 3....
         *
         *  2. Khai báo 1 mảng trong JAVA:
         *          - Cách 1:
         *              <Kiểu dữ liệu>[] arr<Tên Mảng>; || <Kiểu dữ liệu> arr<Tên Mảng>[];
         *              arr<Tên Mảng> = new <Kiểu dữ liệu>[length];//Khởi tạo mảng có kích thước.
         *          - Cách 2: 
         *              <Kiểu dữ liệu>[] arr<Tên Mảng> = new <Kiểu dữ liệu>[length];
         *
         *          - Cách 3:
         *     <Kiểu dữ liệu>[] arr<Tên Mảng> = new <Kiểu dữ liệu>[] {value1,value2..,valuen};//Khởi tạo mảng kiểu tường minh.
         *
         *     
         *
         *  3. Truy xuất các phần tử trong mảng
         *      - Gán giá trị cho mảng:
         *           <tên mảng>[index] = Giá trị cần gán.
         *   
         *     - Lấy giá trị trong mảng:
         *          <tên mảng>[index] = Giá trị của mảng tại vị trí.
         *      Lưu ý: Để lấy nhiều giá trị trong mảng xuất ra cần sử dụng vòng lòng.
         *
         *  4. Kích thước hoặc độ dài của mảng sử dụng thuộc tính length.
         *      <tên mảng>.length = kích thước mảng có kiểu số nguyên
   */
    //main + tab
    public static void main(String[] args) {
        //1. Khai báo & khởi tạo mảng
        int [] arrMSV; //khai báo mảng
        arrMSV = new int[5];//khởi tạo mảng có kích thước =5
        //2. Gán giá trị
        arrMSV[0] = 111;//ctrl shif mũi tên
        arrMSV[1] = 222;
        arrMSV[2] = 333;
        arrMSV[3] = 444;
        arrMSV[4] = 555;
        //3. Truy xuất phần tử
        System.out.println("arrMSV[0] = "+ arrMSV[0]);
        System.out.println("Độ dài mảng = "+ arrMSV.length);
        //4. Duyệt mảng
        //for + tab
        for (int i = 0; i < arrMSV.length; i++) {
            System.out.println("arrMSV["+ i +"] = "+ arrMSV[i]);
        }
        //for each
        //fore + tab
        for (int msv : arrMSV) {
            System.out.println("MSV= "+ msv);
        }
        //khai báo & khởi tạo 1 mảng họ tên gồm 5 phần tử 
        //Khởi tạo mảng kiểu tường minh.
        String arrHoTen[] =  new String[]{"Anh","Lan","Hoa","Ngoc","Trang"};
        //duyệt mảng theo 2 cách
        for (String hoTen : arrHoTen) {
            System.out.println("Ho ten: "+ hoTen);
        }
        //khai báo & khởi tạo 1 mảng điểm gồm 5 phần tử
        int arrDiem[]= new int[]{8,10,5,2,7};
        //sắp xếp tăng dần
        Arrays.sort(arrDiem);
        for (int diem : arrDiem) {
            System.out.print(diem+"; ");
        }
        System.out.println("");
        int viTri= Arrays.binarySearch(arrDiem, 7);
        System.out.println("Vi tri: "+ viTri);
    }
}
