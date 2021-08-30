package Lab2;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số điện tháng trước theo đồng hồ: ");
        int n1 = Integer.parseInt(String.valueOf(sc.nextInt()));
        System.out.println("Nhập vào số điện tháng này theo đồng hồ: ");
        int n2 = Integer.parseInt(String.valueOf(sc.nextInt()));
        int n = 0;
        int n3 = n2-n1;
        if(n3<=50){
            n = n3*230;
        }
        if(100>n3&&n3>50){
            n= (n3-50)*480;
        }
        if(100<n3&&n3<150){
            n = n3*700;
        }
        if(n3>150){
            n = n3*900;
        }
        System.out.println("Chỉ số mới: "+n2+" Chỉ số cũ: "+n1);
        System.out.println("Sô tiền trả định mức là: "+ (50*230));
        System.out.println("Số tiền trả vượt mức là: "+(n-(50*230)));
        System.out.println("Tổng tiền phải trả: "+n);
    }
}
