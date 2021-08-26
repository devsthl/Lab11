package Lab1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int a2;
        System.out.println("Nhap vao so nguyen n: ");
        a = sc.nextInt();
        a2 = a*a;
        System.out.println("Binh phuong so nguyen n la: " + a2);
    }
}
