package Lab1;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên có 3 chữ số: ");
        int n = sc.nextInt();
        int n1;
        int n2;
        int n3;
        n1 = n/100;
        n2 = (n/10)%10;
        n3 = n%10;
        System.out.println("Chữ số hàng trăm: " +n1);
        System.out.println("Chữ số hàng chục: "+n2);
        System.out.println("Chữ số hàng đơn vị: " +n3);
        System.out.println("Đảo ngược của 3 số là: "+ n3+n2+n1);
    }
}
