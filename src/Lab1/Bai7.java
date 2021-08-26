package Lab1;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào bàn phím số nguyên có 4 chữ số: ");
        int n = sc.nextInt();
        int nt = n/1000 + n%10 + (n/10)%10 + (n/100)%10;
        System.out.println("Tổng của 4 chữ số nguyên là: "+ nt );
    }
}
