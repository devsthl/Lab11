package Lab1;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String maSV;
        String tenSV;
        int age;
        String sdt;
        String gt;
        String mail;
        String adress;
        System.out.println("Nhập mã sinh viên: ");
        maSV = sc.nextLine();
        System.out.println("Nhập tên sinh viên: ");
        tenSV = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        age = sc.nextInt();
        System.out.println("Nhập số điện thoại: ");
        sdt = sc.nextLine();
        sc.nextLine();
        System.out.println("Nhập giới tính: ");
        gt = sc.nextLine();
        System.out.println("Nhập email: ");
        mail = sc.nextLine();
        System.out.println("Nhập địa chỉ: ");
        adress = sc.nextLine();
        System.out.println("Mã SV: "+ maSV + "\t Tên SV: "+ tenSV);
        System.out.println("Tuổi: " + age + "\t\t Số ĐT: "+ sdt+ "\t Mail: "+ mail);
        System.out.println("Giới Tính: "+gt+"\t\t Địa chỉ: "+ adress);
    }
}
