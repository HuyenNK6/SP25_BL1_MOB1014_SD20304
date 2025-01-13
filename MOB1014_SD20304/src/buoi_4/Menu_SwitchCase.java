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
public class Menu_SwitchCase {
    public static void main(String[] args) {
        // nhập vào tháng, năm -> kiểm tra tháng đó có bao nhiêu ngày
        Scanner sc= new Scanner(System.in);
        System.out.println("Mời nhập tháng: ");
        int thang= Integer.parseInt(sc.nextLine());
        System.out.println("Mời nhập năm: ");
        int nam= Integer.parseInt(sc.nextLine());
        
        //sw + tab
         switch (thang) {
            case 1:
                System.out.println("case 1");
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang "+ thang+" co 31 ngay");
                break;
            case 4,6,9,11:
                System.out.println("Thang "+ thang+" co 30 ngay");
                break;
            case 2:
                if ((nam%4==0 & nam%100!=0) || nam%400==0) {
                    System.out.println("Thang "+ thang+" co 29 ngay");
                } else {
                    System.out.println("Thang "+ thang+" co 28 ngay");
                }
                 break;   
            default:
                System.out.println("Mời nhập lại!!");
        }
        
    }
}
