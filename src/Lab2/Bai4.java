package Lab2;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào độ dài cạnh thứ 1 của 1 tam giác: ");
        int a = sc.nextInt();
        System.out.println("Nhập vào độ dài cạnh thứ 2 của 1 tam giác: ");
        int b = sc.nextInt();
        System.out.println("Nhập vào độ dài cạnh thứ 3 của 1 tam giác: ");
        int c = sc.nextInt();
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            if ((a == b) || (a == c) || (b == c)) {
                System.out.println("Tam giác trên là tam giác cân");
            } else {
                System.out.println("3 cạnh trên tạo thành tam giac");
            }
            if ((a == b) && (a == c) && (b == c)) {
                System.out.println("Tam giác trên là tam giác đều");
            }
        } else {
            System.out.println("3 cạnh trên không tạo thành 1 tam giác");
        }
        if (c == Math.sqrt(a * a + b * b) || b == Math.sqrt(a * a + c * c) || a == Math.sqrt(b * b + c * c)) {
            System.out.print("Tam giác trên là tam giác vuông");
        }
    }
}
